package com.mec.libapi.repository;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Trending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrendingRepository extends JpaRepository<Trending, Long> {
    Optional<Book> findByTrending(boolean trending);
}
