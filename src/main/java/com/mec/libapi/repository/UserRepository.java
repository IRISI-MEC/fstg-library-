package com.mec.libapi.repository;

import com.mec.libapi.entity.Student;
import com.mec.libapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<Student> findByEmailAndPassword(String email, String password);
}
