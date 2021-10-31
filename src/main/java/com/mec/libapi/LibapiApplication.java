package com.mec.libapi;

import com.mec.libapi.entity.Student;
import com.mec.libapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LibapiApplication {
	@Autowired
	private static StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibapiApplication.class, args);
		List<Student> students = studentRepository.findAll();
	}
}
