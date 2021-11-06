package com.mec.libapi.infrastructure.dao.impl.bookModule;

import com.mec.libapi.infrastructure.entity.bookModule.SpecialityEntity;
import com.mec.libapi.infrastructure.dao.repository.bookModule.SpecialityRepository;
import com.mec.libapi.infrastructure.dao.facade.bookModule.SpecialityFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class SpecialityFacadeImpl implements SpecialityFacade {

    @Autowired
    private SpecialityRepository repository;

    @Override
    public SpecialityEntity save(SpecialityEntity specialityEntity) {
        return repository.save(specialityEntity);
    }

    @Override
    public Optional<SpecialityEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<SpecialityEntity> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(SpecialityEntity specialityEntity) {
        repository.delete(specialityEntity);
    }

    @Override
    public Optional<SpecialityEntity> findByLabel(String label) {
        return repository.findByLabel(label);
    }

}
