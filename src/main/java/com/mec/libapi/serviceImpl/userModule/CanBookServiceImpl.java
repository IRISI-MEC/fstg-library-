package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.CanBook;
import com.mec.libapi.service.userModule.CanBookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CanBookServiceImpl implements CanBookService {
    @Override
    public CanBook save(CanBook canBook) {
        return null;
    }

    @Override
    public List<CanBook> saveAll(Iterable<CanBook> canBooks) {
        return null;
    }

    @Override
    public Optional<CanBook> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stream<CanBook> findAll() {
        return null;
    }

    @Override
    public CanBook update(CanBook canBook) {
        return null;
    }

    @Override
    public void delete(CanBook canBook) {

    }
}
