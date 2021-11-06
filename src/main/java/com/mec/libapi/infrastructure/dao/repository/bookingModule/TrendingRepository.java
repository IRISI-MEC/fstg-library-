package com.mec.libapi.infrastructure.dao.repository.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.Trending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrendingRepository extends JpaRepository<Trending, Long> {
    Optional<Trending> findByTrending(boolean trending);
}
