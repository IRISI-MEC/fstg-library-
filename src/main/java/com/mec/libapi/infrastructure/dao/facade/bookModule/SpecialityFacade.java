package com.mec.libapi.infrastructure.dao.facade.bookModule;

import com.mec.libapi.infrastructure.entity.bookModule.SpecialityEntity;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.util.Optional;

public interface SpecialityFacade extends AbstractFacade<SpecialityEntity, Long> {

    Optional<SpecialityEntity> findByLabel(String label);

}
