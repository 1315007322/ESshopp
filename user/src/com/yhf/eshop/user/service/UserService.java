package com.yhf.eshop.user.service;

import com.yhf.eshop.user.entity.UserEntity;

public interface UserService {
    UserEntity login(UserEntity User) throws Exception;

}
