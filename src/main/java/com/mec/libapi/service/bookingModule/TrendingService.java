package com.mec.libapi.service.bookingModule;

import com.mec.libapi.entity.bookingModule.Trending;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface TrendingService extends AbstractService<Trending, Long> {
    Optional<Trending> findByTrending(boolean trending);
}
