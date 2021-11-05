package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.Supervisor;
import com.mec.libapi.service.userModule.SupervisorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class SupervisorServiceImpl implements SupervisorService {
    @Override
    public Supervisor save(Supervisor supervisor) {
        return null;
    }

    @Override
    public List<Supervisor> saveAll(Iterable<Supervisor> supervisors) {
        return null;
    }

    @Override
    public Optional<Supervisor> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stream<Supervisor> findAll() {
        return null;
    }

    @Override
    public Supervisor update(Supervisor supervisor) {
        return null;
    }

    @Override
    public void delete(Supervisor supervisor) {

    }
}
