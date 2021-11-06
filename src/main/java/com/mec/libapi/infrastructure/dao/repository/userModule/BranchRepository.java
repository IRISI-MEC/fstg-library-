package com.mec.libapi.infrastructure.dao.repository.userModule;

import com.mec.libapi.infrastructure.entity.userModule.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
