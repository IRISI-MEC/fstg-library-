package com.mec.libapi.infrastructure.dao.repository.userModule;

import com.mec.libapi.infrastructure.entity.userModule.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
}
