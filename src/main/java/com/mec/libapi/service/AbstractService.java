package com.mec.libapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface AbstractService<T, ID> {
    T save(T t);

    List<T> saveAll(Iterable<T> t);

    Optional<T> findById(ID id);

    Stream<T> findAll();

    void delete(T t);
}
