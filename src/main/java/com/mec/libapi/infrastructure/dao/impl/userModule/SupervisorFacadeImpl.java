package com.mec.libapi.infrastucture.dao.impl.userModule;

import com.mec.libapi.infrastucture.entity.userModule.Supervisor;
import com.mec.libapi.infrastucture.dao.repository.userModule.SupervisorRepository;
import com.mec.libapi.infrastucture.dao.facade.userModule.SupervisorFacade;
import com.mec.libapi.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class SupervisorFacadeImpl implements SupervisorFacade {

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
