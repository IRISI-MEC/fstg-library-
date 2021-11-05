package com.mec.libapi.infrastucture.dao.facade.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.Comment;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface CommentFacade extends AbstractFacade<Comment, Long> {
    Optional<Comment> findByStarsNumber(Integer starsNumber);

}
