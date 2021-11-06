package com.mec.libapi.infrastructure.dao.repository.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Comment> findByStarsNumber(Integer starsNumber);
}
