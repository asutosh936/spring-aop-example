package com.spring.aop.learn.service;

import com.spring.aop.learn.model.User;

public interface UserService {

    User createUser(User user);
    User getUser(int userId);
}
