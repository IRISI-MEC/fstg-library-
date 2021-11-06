package com.mec.libapi.infrastucture.dao.impl.bookingModule;

import com.mec.libapi.infrastucture.entity.bookingModule.Comment;
import com.mec.libapi.infrastucture.dao.repository.bookingModule.CommentRepository;
import com.mec.libapi.infrastucture.dao.facade.bookingModule.CommentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CommentFacadeImpl implements CommentFacade {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Stream<Comment> findAll() {
        return commentRepository.findAll().stream();
    }


    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }

    @Override
    public Optional<Comment> findByStarsNumber(Integer starsNumber) {
        return commentRepository.findByStarsNumber(starsNumber);
    }
}
