package com.mec.libapi.serviceImpl.userModule;

import com.mec.libapi.entity.userModule.User;
import com.mec.libapi.repository.userModule.UserRepository;
import com.mec.libapi.service.userModule.UserService;
import com.mec.libapi.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        String hashedPassword = HashUtil.encryptPassword(user.getPassword());
        user.setPassword(hashedPassword);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Stream<User> findAll() {
        return userRepository.findAll().stream();
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public Optional<User> login(String email, String password) {
        String hashedPassword = HashUtil.encryptPassword(password);
        return userRepository.findByEmailAndPassword(email, hashedPassword);
    }
}
