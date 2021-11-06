package com.mec.libapi.infrastucture.dao.facade.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.Trending;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface TrendingFacade extends AbstractFacade<Trending, Long> {
    Optional<Trending> findByTrending(boolean trending);
}
