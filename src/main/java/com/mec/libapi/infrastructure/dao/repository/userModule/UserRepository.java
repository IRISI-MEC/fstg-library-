package com.mec.libapi.infrastucture.dao.repository.userModule;

import com.mec.libapi.infrastucture.entity.userModule.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
}
