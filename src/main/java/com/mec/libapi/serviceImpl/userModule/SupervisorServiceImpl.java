package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.Supervisor;
import com.mec.libapi.repository.userModule.SupervisorRepository;
import com.mec.libapi.service.userModule.SupervisorService;
import com.mec.libapi.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    private SupervisorRepository supervisorRepository;

    @Override
    public Supervisor save(Supervisor supervisor) {
        String hashedPassword = HashUtil.encryptPassword(supervisor.getPassword());
        supervisor.setPassword(hashedPassword);
        return supervisorRepository.save(supervisor);
    }

    @Override
    public Optional<Supervisor> findById(Long id) {
        return supervisorRepository.findById(id);
    }

    @Override
    public Stream<Supervisor> findAll() {
        return supervisorRepository.findAll().stream();
    }

    @Override
    public void delete(Supervisor supervisor) {
        supervisorRepository.delete(supervisor);
    }
}
