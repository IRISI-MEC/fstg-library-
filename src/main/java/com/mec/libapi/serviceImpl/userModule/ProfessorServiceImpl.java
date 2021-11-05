package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.Professor;
import com.mec.libapi.service.userModule.ProfessorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Override
    public Professor save(Professor professor) {
        return null;
    }

    @Override
    public List<Professor> saveAll(Iterable<Professor> professors) {
        return null;
    }

    @Override
    public Optional<Professor> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Stream<Professor> findAll() {
        return null;
    }

    @Override
    public Professor update(Professor professor) {
        return null;
    }

    @Override
    public void delete(Professor professor) {

    }
}
