package com.mec.libapi.serviceImpl.bookModule;

import com.mec.libapi.entity.bookModule.Detail;
import com.mec.libapi.repository.bookModule.DetailRepository;
import com.mec.libapi.service.bookModule.DetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Stream;

public class DetailServiceImpl implements DetailService {

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
