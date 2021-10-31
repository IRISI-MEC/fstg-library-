package com.mec.libapi.repository;

import com.mec.libapi.entity.Professor;
import com.mec.libapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
