package com.mec.libapi.infrastructure.dao.repository.userModule;

import com.mec.libapi.infrastructure.entity.userModule.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
