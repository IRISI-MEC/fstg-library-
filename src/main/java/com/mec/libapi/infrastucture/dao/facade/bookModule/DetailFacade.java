package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.Detail;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface DetailFacade extends AbstractFacade<Detail, Long> {

    Optional<Detail> findByAllAttributes(String butType, String condition, String dSlip, String provider);

}
