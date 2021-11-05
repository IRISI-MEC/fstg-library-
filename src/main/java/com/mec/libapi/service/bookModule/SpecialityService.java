package com.mec.libapi.service.bookModule;

import com.mec.libapi.entity.bookModule.Speciality;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface SpecialityService extends AbstractService<Speciality, Long> {

    Optional<Speciality> findByLabel(String label);

}
