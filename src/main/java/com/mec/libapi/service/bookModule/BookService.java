package com.mec.libapi.service.bookModule;

import com.mec.libapi.entity.bookModule.Book;
import com.mec.libapi.entity.bookModule.Speciality;
import com.mec.libapi.service.AbstractService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface BookService extends AbstractService<Book, Long> {

    public List<Book> saveAll(Iterable<Book> books);
    Optional<Book> findByIsbn(String isbn);
    Optional<Book> findByTitleContains(String keyword);
    Stream<Book> findByAuthor(String author);
    Stream<Book> findBySpeciality(Speciality speciality);

}
