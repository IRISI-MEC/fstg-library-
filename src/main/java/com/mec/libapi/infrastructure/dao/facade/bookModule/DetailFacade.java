package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.DetailEntity;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface DetailFacade extends AbstractFacade<DetailEntity, Long> {

    Optional<DetailEntity> findByAllAttributes(String butType, String condition, String dSlip, String provider);

}
