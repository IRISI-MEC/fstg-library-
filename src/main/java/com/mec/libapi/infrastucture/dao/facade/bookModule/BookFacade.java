package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Book;
import com.mec.libapi.infrastucture.entity.bookModule.Speciality;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface BookFacade extends AbstractFacade<Book, Long> {

    public List<Book> saveAll(Iterable<Book> books);
    Optional<Book> findByIsbn(String isbn);
    Optional<Book> findByTitleContains(String keyword);
    Stream<Book> findByAuthor(String author);
    Stream<Book> findBySpeciality(Speciality speciality);

}
