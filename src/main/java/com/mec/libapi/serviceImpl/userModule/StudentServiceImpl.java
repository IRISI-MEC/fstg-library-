package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.Student;
import com.mec.libapi.repository.userModule.StudentRepository;
import com.mec.libapi.service.userModule.StudentService;
import com.mec.libapi.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        String hashedPassword = HashUtil.encryptPassword(student.getPassword());
        student.setPassword(hashedPassword);
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Stream<Student> findAll() {
        return studentRepository.findAll().stream();
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
