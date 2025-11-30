package com.spring.aop.learn.service;

import com.spring.aop.learn.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    private static Map<Integer, User> userMap = new HashMap<>();

    @Override
    public User createUser(User user) {
        userMap.put(user.getUserId(), user);
        return user;
    }

    @Override
    public User getUser(int userId) {
        return userMap.get(userId);
    }
}
