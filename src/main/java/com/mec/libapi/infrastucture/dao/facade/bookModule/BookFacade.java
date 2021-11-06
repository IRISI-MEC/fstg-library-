package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.BookEntity;
import com.mec.libapi.infrastucture.entity.bookModule.SpecialityEntity;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface BookFacade extends AbstractFacade<BookEntity, Long> {

    List<BookEntity> saveAll(Iterable<BookEntity> books);
    Optional<BookEntity> findByIsbn(String isbn);
    Optional<BookEntity> findByTitleContains(String keyword);
    Stream<BookEntity> findByAuthor(String author);
    Stream<BookEntity> findBySpecialityEntity(SpecialityEntity specialityEntity);

}
