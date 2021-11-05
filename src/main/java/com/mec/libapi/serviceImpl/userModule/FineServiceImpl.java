package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.Fine;
import com.mec.libapi.service.userModule.FineService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class FineServiceImpl implements FineService {
    @Override
    public Fine save(Fine fine) {
        return null;
    }

    @Override
    public List<Fine> saveAll(Iterable<Fine> fines) {
        return null;
    }

    @Override
    public Optional<Fine> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stream<Fine> findAll() {
        return null;
    }

    @Override
    public Fine update(Fine fine) {
        return null;
    }

    @Override
    public void delete(Fine fine) {

    }
}
