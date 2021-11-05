package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.Branch;
import com.mec.libapi.service.userModule.BranchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public Branch save(Branch branch) {
        return null;
    }

    @Override
    public List<Branch> saveAll(Iterable<Branch> branches) {
        return null;
    }

    @Override
    public Optional<Branch> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stream<Branch> findAll() {
        return null;
    }

    @Override
    public Branch update(Branch branch) {
        return null;
    }

    @Override
    public void delete(Branch branch) {

    }
}
