package com.mec.libapi.infrastructure.dao.facade.bookModule;

import com.mec.libapi.infrastructure.entity.bookModule.NCaseEntity;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.util.Optional;

public interface NCaseFacade extends AbstractFacade<NCaseEntity, Long> {

    Optional<NCaseEntity> findByCode(String code);

}
