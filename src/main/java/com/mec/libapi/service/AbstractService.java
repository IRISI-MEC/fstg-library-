package com.mec.libapi.service;

import java.util.Optional;
import java.util.stream.Stream;

public interface AbstractService<T, ID> {
    T save(T t);

    Optional<T> findById(ID id);

    Stream<T> findAll();

    void delete(T t);
}
