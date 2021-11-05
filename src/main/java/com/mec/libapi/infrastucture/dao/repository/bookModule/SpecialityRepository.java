package com.mec.libapi.infrastucture.dao.repository.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Long> {

    Optional<Speciality> findByLabel(String label);

}
