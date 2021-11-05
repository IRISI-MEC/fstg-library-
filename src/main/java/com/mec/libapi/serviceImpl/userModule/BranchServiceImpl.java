package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.Branch;
import com.mec.libapi.repository.userModule.BranchRepository;
import com.mec.libapi.service.userModule.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BranchServiceImpl implements BranchService {

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
