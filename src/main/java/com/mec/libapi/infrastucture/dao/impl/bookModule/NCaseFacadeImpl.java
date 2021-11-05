package com.mec.libapi.infrastucture.dao.impl.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.NCase;
import com.mec.libapi.infrastucture.dao.repository.bookModule.NCaseRepository;
import com.mec.libapi.infrastucture.dao.facade.bookModule.NCaseFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class NCaseFacadeImpl implements NCaseFacade {

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
