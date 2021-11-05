package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.Professor;
import com.mec.libapi.repository.userModule.ProfessorRepository;
import com.mec.libapi.service.userModule.ProfessorService;
import com.mec.libapi.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Professor save(Professor professor) {
        String hashedPassword = HashUtil.encryptPassword(professor.getPassword());
        professor.setPassword(hashedPassword);
        return professorRepository.save(professor);
    }

    @Override
    public Optional<Professor> findById(Long id) {
        return professorRepository.findById(id);
    }

    @Override
    public Stream<Professor> findAll() {
        return professorRepository.findAll().stream();
    }

    @Override
    public void delete(Professor professor) {
        professorRepository.delete(professor);
    }
}
