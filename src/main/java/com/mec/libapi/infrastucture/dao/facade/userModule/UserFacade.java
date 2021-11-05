package com.mec.libapi.infrastucture.dao.facade.userModule;

import com.mec.libapi.infrastucture.entity.userModule.User;
import com.mec.libapi.infrastucture.dao.facade.AbstractFacade;

import java.util.Optional;

public interface UserFacade extends AbstractFacade<User, Long> {
    Optional<User> login(String email, String password);
}
