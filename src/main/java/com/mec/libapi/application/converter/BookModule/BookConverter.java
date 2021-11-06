package com.mec.libapi.application.converter.BookModule;

import com.mec.libapi.application.dto.bookModule.BookDto;
import com.mec.libapi.application.dto.bookModule.SpecialityDto;
import com.mec.libapi.domain.pojo.bookModule.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookConverter {

    @Autowired
    InstanceConverter instanceConverter;
    @Autowired
    SpecialityConverter specialityConverter;

    public Book toPojo(BookDto bookDto) {
        return Book.builder()
                .id(Long.parseLong(bookDto.getId()))
                .author(bookDto.getAuthor())
                .description(bookDto.getDescription())
                .isbn(bookDto.getIsbn())
                .title(bookDto.getTitle())
                .speciality(specialityConverter.toPojo(bookDto.getSpeciality()))
                .build();
    }

    public BookDto toDto(Book book, Boolean convertInstances, Boolean convertSpeciality) {

        BookDto bookDto = BookDto.builder()
                .id(book.getId().toString())
                .author(book.getAuthor())
                .description(book.getDescription())
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .build();

        if (convertSpeciality)
            bookDto.setSpeciality(specialityConverter.toDto(book.getSpeciality(), false));

        if (convertInstances)
            book.getInstances().forEach(instance -> bookDto.getInstances().add(instanceConverter.toDto(instance, false, true)));

        return bookDto;
    }

}
