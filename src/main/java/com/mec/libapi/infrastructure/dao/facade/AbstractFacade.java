package com.mec.libapi.infrastructure.dao.facade;

import java.util.Optional;
import java.util.stream.Stream;

public interface AbstractFacade<T, ID> {
    T save(T t);

    Optional<T> findById(ID id);

    Stream<T> findAll();

    void delete(T t);
}
