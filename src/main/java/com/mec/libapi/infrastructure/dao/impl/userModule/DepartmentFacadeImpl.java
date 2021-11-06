package com.mec.libapi.infrastucture.dao.impl.userModule;

import com.mec.libapi.infrastucture.entity.userModule.Department;
import com.mec.libapi.infrastucture.dao.repository.userModule.DepartmentRepository;
import com.mec.libapi.infrastucture.dao.facade.userModule.DepartmentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class DepartmentFacadeImpl implements DepartmentFacade {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Stream<Department> findAll() {
        return departmentRepository.findAll().stream();
    }

    @Override
    public void delete(Department department) {
        departmentRepository.delete(department);
    }
}
