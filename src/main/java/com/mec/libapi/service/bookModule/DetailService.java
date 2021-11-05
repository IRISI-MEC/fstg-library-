package com.mec.libapi.service.bookModule;

import com.mec.libapi.entity.bookModule.Detail;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface DetailService extends AbstractService<Detail, Long> {

    Optional<Detail> findByAllAttributes(String butType, String condition, String dSlip, String provider);

}
