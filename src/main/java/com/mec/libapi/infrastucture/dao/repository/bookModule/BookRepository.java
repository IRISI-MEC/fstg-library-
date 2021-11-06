package com.mec.libapi.infrastucture.dao.repository.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.BookEntity;
import com.mec.libapi.infrastucture.entity.bookModule.SpecialityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    Optional<BookEntity> findByIsbn(String isbn);

    Optional<BookEntity> findByTitleContains(String keyword);

    Stream<BookEntity> findByAuthor(String author);

    Stream<BookEntity> findBySpecialityEntity(SpecialityEntity specialityEntity);

}
