package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.CanBook;
import com.mec.libapi.repository.userModule.CanBookRepository;
import com.mec.libapi.service.userModule.CanBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CanBookServiceImpl implements CanBookService {

    @Autowired
    private CanBookRepository canBookRepository;

    @Override
    public CanBook save(CanBook canBook) {
        return canBookRepository.save(canBook);
    }

    @Override
    public Optional<CanBook> findById(Long id) {
        return canBookRepository.findById(id);
    }

    @Override
    public Stream<CanBook> findAll() {
        return canBookRepository.findAll().stream();
    }

    @Override
    public void delete(CanBook canBook) {
        canBookRepository.delete(canBook);
    }
}
