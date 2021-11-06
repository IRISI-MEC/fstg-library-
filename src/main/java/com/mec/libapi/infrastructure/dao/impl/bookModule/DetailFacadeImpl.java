package com.mec.libapi.infrastructure.dao.impl.bookModule;

import com.mec.libapi.infrastructure.entity.bookModule.DetailEntity;
import com.mec.libapi.infrastructure.dao.repository.bookModule.DetailRepository;
import com.mec.libapi.infrastructure.dao.facade.bookModule.DetailFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class DetailFacadeImpl implements DetailFacade {

    @Autowired
    private DetailRepository repository;

    @Override
    public DetailEntity save(DetailEntity detail) {
        return repository.save(detail);
    }

    @Override
    public Optional<DetailEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<DetailEntity> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(DetailEntity detail) {
        repository.delete(detail);
    }

    @Override
    public Optional<DetailEntity> findByAllAttributes(String butType, String condition, String dSlip, String provider) {
        return repository.findByBuyTypeAndConditionAndDeliverySlipAndProvider(butType, condition, dSlip, provider);
    }
}
