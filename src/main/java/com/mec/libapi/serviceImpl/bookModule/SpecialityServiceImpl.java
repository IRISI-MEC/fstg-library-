package com.mec.libapi.serviceImpl.bookModule;

import com.mec.libapi.entity.bookModule.Speciality;
import com.mec.libapi.repository.bookModule.SpecialityRepository;
import com.mec.libapi.service.bookModule.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityRepository repository;

    @Override
    public Speciality save(Speciality speciality) {
        return repository.save(speciality);
    }

    @Override
    public Optional<Speciality> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<Speciality> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(Speciality speciality) {
        repository.delete(speciality);
    }

    @Override
    public Optional<Speciality> findByLabel(String label) {
        return repository.findByLabel(label);
    }

}
