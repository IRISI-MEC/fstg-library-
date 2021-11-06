package com.mec.libapi.infrastucture.dao.impl.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.BookEntity;
import com.mec.libapi.infrastucture.entity.bookModule.SpecialityEntity;
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
    public BookEntity save(BookEntity bookEntity) {
        return repository.save(bookEntity);
    }

    @Override
    public List<BookEntity> saveAll(Iterable<BookEntity> books) { return repository.saveAllAndFlush(books); }

    @Override
    public Optional<BookEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<BookEntity> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(BookEntity bookEntity) {
        repository.delete(bookEntity);
    }

    @Override
    public Optional<BookEntity> findByIsbn(String isbn) {
        return repository.findByIsbn(isbn);
    }

    @Override
    public Optional<BookEntity> findByTitleContains(String keyword) {
        return repository.findByTitleContains(keyword);
    }

    @Override
    public Stream<BookEntity> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public Stream<BookEntity> findBySpecialityEntity(SpecialityEntity specialityEntity) {
        return repository.findBySpecialityEntity(specialityEntity);
    }
}
