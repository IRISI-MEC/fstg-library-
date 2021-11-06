package com.mec.libapi.infrastructure.dao.repository.userModule;

import com.mec.libapi.infrastructure.entity.userModule.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
