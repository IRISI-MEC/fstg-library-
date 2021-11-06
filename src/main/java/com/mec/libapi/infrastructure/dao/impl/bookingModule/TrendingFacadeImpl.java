package com.mec.libapi.infrastructure.dao.impl.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.Trending;
import com.mec.libapi.infrastructure.dao.repository.bookingModule.TrendingRepository;
import com.mec.libapi.infrastructure.dao.facade.bookingModule.TrendingFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class TrendingFacadeImpl implements TrendingFacade {

    @Autowired
    private TrendingRepository trendingRepository;

    @Override
    public Trending save(Trending trending) {
        return trendingRepository.save(trending);
    }

    @Override
    public Optional<Trending> findById(Long id) {
        return trendingRepository.findById(id);
    }

    @Override
    public Stream<Trending> findAll() {
        return trendingRepository.findAll().stream();
    }


    @Override
    public void delete(Trending trending) {
        trendingRepository.delete(trending);
    }

    @Override
    public Optional<Trending> findByTrending(boolean trending) {
        return trendingRepository.findByTrending(trending);
    }
}
