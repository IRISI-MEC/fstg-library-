package com.mec.libapi.service.bookingModule;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Trending;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface TrendingService extends AbstractService<Trending, Long> {
    Optional<Book> findByTrending(boolean trending);
}
