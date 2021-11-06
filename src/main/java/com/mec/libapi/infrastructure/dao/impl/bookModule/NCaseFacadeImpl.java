package com.mec.libapi.infrastructure.dao.impl.bookModule;

import com.mec.libapi.infrastructure.entity.bookModule.NCaseEntity;
import com.mec.libapi.infrastructure.dao.repository.bookModule.NCaseRepository;
import com.mec.libapi.infrastructure.dao.facade.bookModule.NCaseFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class NCaseFacadeImpl implements NCaseFacade {

    @Autowired
    private NCaseRepository repository;

    @Override
    public NCaseEntity save(NCaseEntity nCaseEntity) {
        return repository.save(nCaseEntity);
    }

    @Override
    public Optional<NCaseEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<NCaseEntity> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(NCaseEntity nCaseEntity) {
        repository.delete(nCaseEntity);
    }

    @Override
    public Optional<NCaseEntity> findByCode(String code) {
        return repository.findByCode(code);
    }

}
