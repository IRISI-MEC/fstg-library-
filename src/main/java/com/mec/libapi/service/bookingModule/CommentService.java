package com.mec.libapi.service.bookingModule;

import com.mec.libapi.entity.bookingModule.Comment;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface CommentService extends AbstractService<Comment, Long> {
    Optional<Comment> findByStarsNumber(Integer starsNumber);

}
