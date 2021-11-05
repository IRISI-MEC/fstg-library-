package com.mec.libapi.service.userModule;

import com.mec.libapi.entity.userModule.User;
import com.mec.libapi.service.AbstractService;

import java.util.Optional;

public interface UserService extends AbstractService<User, Long> {
    Optional<User> login(String email, String password);
}
