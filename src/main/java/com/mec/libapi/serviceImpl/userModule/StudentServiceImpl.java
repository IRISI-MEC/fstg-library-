package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.Student;
import com.mec.libapi.repository.StudentRepository;
import com.mec.libapi.service.userModule.StudentService;
import com.mec.libapi.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<Student> saveAll(Iterable<Student> students) {
        return null;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stream<Student> findAll() {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(Student student) {

    }
}
