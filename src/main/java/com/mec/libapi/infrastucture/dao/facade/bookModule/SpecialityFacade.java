package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Speciality;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface SpecialityFacade extends AbstractFacade<Speciality, Long> {

    Optional<Speciality> findByLabel(String label);

}
