package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.NCaseEntity;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface NCaseFacade extends AbstractFacade<NCaseEntity, Long> {

    Optional<NCaseEntity> findByCode(String code);

}
