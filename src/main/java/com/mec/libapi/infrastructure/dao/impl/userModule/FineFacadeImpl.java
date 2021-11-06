package com.mec.libapi.infrastucture.dao.impl.userModule;

import com.mec.libapi.infrastucture.entity.userModule.Fine;
import com.mec.libapi.infrastucture.dao.repository.userModule.FineRepository;
import com.mec.libapi.infrastucture.dao.facade.userModule.FineFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class FineFacadeImpl implements FineFacade {

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
