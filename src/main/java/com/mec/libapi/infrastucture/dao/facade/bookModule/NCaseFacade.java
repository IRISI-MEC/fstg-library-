package com.mec.libapi.infrastucture.dao.facade.bookModule;

import com.mec.libapi.infrastucture.entity.bookModule.NCase;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface NCaseFacade extends AbstractFacade<NCase, Long> {

    Optional<NCase> findByCode(String code);

}
