package com.mec.libapi.repository.userModule;

import com.mec.libapi.entity.userModule.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
