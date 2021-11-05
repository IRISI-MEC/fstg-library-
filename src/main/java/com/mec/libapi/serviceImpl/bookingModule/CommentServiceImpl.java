package com.mec.libapi.serviceImpl.bookingModule;

import com.mec.libapi.entity.Book;
import com.mec.libapi.entity.Comment;
import com.mec.libapi.repository.CommentRepository;
import com.mec.libapi.service.bookingModule.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> saveAll(Iterable<Comment> comments) {
        return commentRepository.saveAllAndFlush(comments);
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
    public Optional<Book> findByStarsNumber(Integer starsNumber) {
        return commentRepository.findByStarsNumber(starsNumber);
    }
}
