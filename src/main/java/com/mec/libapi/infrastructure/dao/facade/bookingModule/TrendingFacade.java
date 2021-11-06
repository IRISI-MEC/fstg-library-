package com.mec.libapi.infrastructure.dao.facade.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.Trending;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.util.Optional;

public interface TrendingFacade extends AbstractFacade<Trending, Long> {
    Optional<Trending> findByTrending(boolean trending);
}
