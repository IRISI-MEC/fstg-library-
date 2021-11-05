package com.mec.libapi.serviceImpl.bookModule;

import com.mec.libapi.entity.bookModule.NCase;
import com.mec.libapi.repository.bookModule.NCaseRepository;
import com.mec.libapi.service.bookModule.NCaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class NCaseServiceImpl implements NCaseService {

    @Autowired
    private NCaseRepository repository;

    @Override
    public NCase save(NCase nCase) {
        return repository.save(nCase);
    }

    @Override
    public Optional<NCase> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<NCase> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(NCase nCase) {
        repository.delete(nCase);
    }

    @Override
    public Optional<NCase> findByCode(String code) {
        return repository.findByCode(code);
    }

}
