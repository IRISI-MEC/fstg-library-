package com.mec.libapi.repository;

import com.mec.libapi.entity.NCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NCaseRepository extends JpaRepository<NCase, Long> {

    Optional<NCase> findByCode(String code);
}
