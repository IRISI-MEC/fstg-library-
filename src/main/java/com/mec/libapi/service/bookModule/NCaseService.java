package com.mec.libapi.service.bookModule;

import com.mec.libapi.entity.bookModule.NCase;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface NCaseService extends AbstractService<NCase, Long> {

    Optional<NCase> findByCode(String code);

}
