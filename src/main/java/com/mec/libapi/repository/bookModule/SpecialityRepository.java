package com.mec.libapi.repository.bookModule;

import com.mec.libapi.entity.bookModule.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Long> {

    Optional<Speciality> findByLabel(String label);

}
