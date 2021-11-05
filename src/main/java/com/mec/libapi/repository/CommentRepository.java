package com.mec.libapi.repository;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Book> findByStarsNumber(Integer starsNumber);
}
