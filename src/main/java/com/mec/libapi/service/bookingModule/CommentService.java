package com.mec.libapi.service.bookingModule;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Comment;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface CommentService extends AbstractService<Comment, Long> {
    Optional<Book> findByStarsNumber(Integer starsNumber);

}
