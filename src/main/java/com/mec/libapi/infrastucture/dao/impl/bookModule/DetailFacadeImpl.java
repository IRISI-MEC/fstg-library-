package com.mec.libapi.infrastucture.dao.impl.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Detail;
import com.mec.libapi.infrastucture.dao.repository.bookModule.DetailRepository;
import com.mec.libapi.infrastucture.dao.facade.bookModule.DetailFacade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class DetailFacadeImpl implements DetailFacade {

    @Autowired
    private DetailRepository repository;

    @Override
    public Detail save(Detail detail) {
        return repository.save(detail);
    }

    @Override
    public Optional<Detail> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Stream<Detail> findAll() {
        return repository.findAll().stream();
    }

    @Override
    public void delete(Detail detail) {
        repository.delete(detail);
    }

    @Override
    public Optional<Detail> findByAllAttributes(String butType, String condition, String dSlip, String provider) {
        return repository.findByBuyTypeAndConditionAndDeliverySlipAndProvider(butType, condition, dSlip, provider);
    }
}
