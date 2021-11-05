package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.Fine;
import com.mec.libapi.repository.userModule.FineRepository;
import com.mec.libapi.service.userModule.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class FineServiceImpl implements FineService {

    @Autowired
    private FineRepository fineRepository;

    @Override
    public Fine save(Fine fine) {
        return fineRepository.save(fine);
    }

    @Override
    public Optional<Fine> findById(Long id) {
        return fineRepository.findById(id);
    }

    @Override
    public Stream<Fine> findAll() {
        return fineRepository.findAll().stream();
    }

    @Override
    public void delete(Fine fine) {
        fineRepository.delete(fine);
    }
}
