package com.mec.libapi.infrastructure.dao.facade.userModule;

import com.mec.libapi.infrastructure.entity.userModule.User;
import com.mec.libapi.infrastructure.dao.facade.AbstractFacade;

import java.util.Optional;

public interface UserFacade extends AbstractFacade<User, Long> {
    Optional<User> login(String email, String password);
}
