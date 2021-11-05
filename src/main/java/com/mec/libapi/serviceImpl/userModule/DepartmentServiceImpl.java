package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.Department;
import com.mec.libapi.service.userModule.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public Department save(Department department) {
        return null;
    }

    @Override
    public List<Department> saveAll(Iterable<Department> departments) {
        return null;
    }

    @Override
    public Optional<Department> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stream<Department> findAll() {
        return null;
    }

    @Override
    public Department update(Department department) {
        return null;
    }

    @Override
    public void delete(Department department) {

    }
}
