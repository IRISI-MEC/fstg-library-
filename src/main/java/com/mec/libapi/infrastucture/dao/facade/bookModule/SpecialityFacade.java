package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.SpecialityEntity;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface SpecialityFacade extends AbstractFacade<SpecialityEntity, Long> {

    Optional<SpecialityEntity> findByLabel(String label);

}
