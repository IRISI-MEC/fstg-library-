package com.mec.libapi.repository;

import com.mec.libapi.entity.NCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NCaseRepository extends JpaRepository<NCase, Long> {

    Optional<NCase> findByCode(String code);
}
