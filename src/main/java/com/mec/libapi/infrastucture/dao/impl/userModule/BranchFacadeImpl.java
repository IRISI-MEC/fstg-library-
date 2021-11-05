package com.mec.libapi.infrastucture.dao.impl.userModule;

import com.mec.libapi.infrastucture.entity.userModule.Branch;
import com.mec.libapi.infrastucture.dao.repository.userModule.BranchRepository;
import com.mec.libapi.infrastucture.dao.facade.userModule.BranchFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BranchFacadeImpl implements BranchFacade {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Optional<Branch> findById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public Stream<Branch> findAll() {
        return branchRepository.findAll().stream();
    }

    @Override
    public void delete(Branch branch) {
        branchRepository.delete(branch);
    }
}
