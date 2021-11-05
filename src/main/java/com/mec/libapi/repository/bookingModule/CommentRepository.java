package com.mec.libapi.repository.bookingModule;

import com.mec.libapi.entity.bookingModule.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Comment> findByStarsNumber(Integer starsNumber);
}
