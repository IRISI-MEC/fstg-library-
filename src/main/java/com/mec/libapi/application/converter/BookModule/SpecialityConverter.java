package com.mec.libapi.application.converter.BookModule;

import com.mec.libapi.application.dto.bookModule.SpecialityDto;
import com.mec.libapi.domain.pojo.bookModule.Speciality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecialityConverter {

    @Autowired
    BookConverter bookConverter;

    public Speciality toPojo(SpecialityDto specialityDto) {
        return Speciality.builder()
                .id(Long.parseLong(specialityDto.getId()))
                .label(specialityDto.getLabel())
                .build();
    }

    public SpecialityDto toDto(Speciality speciality, Boolean convertBooks) {

        SpecialityDto specialityDto = SpecialityDto.builder()
                .id(speciality.getId().toString())
                .label(speciality.getLabel())
                .build();

        if (convertBooks)
            speciality.getBooks().forEach(book -> specialityDto.getBooks().add(bookConverter.toDto(book, false, false)));

        return specialityDto;
    }
}
