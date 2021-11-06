package com.mec.libapi.infrastructure.dao.facade.bookingModule;

import com.mec.libapi.infrastructure.entity.bookingModule.Comment;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.util.Optional;

public interface CommentFacade extends AbstractFacade<Comment, Long> {
    Optional<Comment> findByStarsNumber(Integer starsNumber);

}
