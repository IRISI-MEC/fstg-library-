package com.mec.libapi.infrastucture.dao.repository.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Book;
import com.mec.libapi.infrastucture.entity.bookModule.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn(String isbn);

    Optional<Book> findByTitleContains(String keyword);

    Stream<Book> findByAuthor(String author);

    Stream<Book> findBySpeciality(Speciality speciality);

}
