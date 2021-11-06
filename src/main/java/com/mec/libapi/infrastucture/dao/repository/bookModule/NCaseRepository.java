package com.mec.libapi.infrastucture.dao.repository.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.NCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NCaseRepository extends JpaRepository<NCaseEntity, Long> {

    Optional<NCaseEntity> findByCode(String code);
}
