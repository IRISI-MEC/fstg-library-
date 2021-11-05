package com.mec.libapi.serviceImpl.bookingModule;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Trending;
import com.mec.libapi.repository.TrendingRepository;
import com.mec.libapi.service.bookingModule.TrendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class TrendingServiceImpl implements TrendingService {

    @Autowired
    private TrendingRepository trendingRepository;

    @Override
    public Trending save(Trending trending) {
        return trendingRepository.save(trending);
    }

    @Override
    public List<Trending> saveAll(Iterable<Trending> trendings) {
        return trendingRepository.saveAllAndFlush(trendings);
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
    public Optional<Book> findByTrending(boolean trending) {
        return trendingRepository.findByTrending(trending);
    }
}
