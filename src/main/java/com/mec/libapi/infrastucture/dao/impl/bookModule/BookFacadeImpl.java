package com.mec.libapi.infrastucture.dao.impl.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Book;
import com.mec.libapi.infrastucture.entity.bookModule.Speciality;
import com.mec.libapi.infrastucture.dao.repository.bookModule.BookRepository;
import com.mec.libapi.infrastucture.dao.facade.bookModule.BookFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class BookFacadeImpl implements BookFacade {

    @Autowired
    private BookRepository repository;

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> saveAll(Iterable<Book> books) { return repository.saveAllAndFlush(books); }

    @Override
    public Optional<Book> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<Book> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(Book book) {
        repository.delete(book);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return repository.findByIsbn(isbn);
    }

    @Override
    public Optional<Book> findByTitleContains(String keyword) {
        return repository.findByTitleContains(keyword);
    }

    @Override
    public Stream<Book> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public Stream<Book> findBySpeciality(Speciality speciality) {
        return repository.findBySpeciality(speciality);
    }
}
