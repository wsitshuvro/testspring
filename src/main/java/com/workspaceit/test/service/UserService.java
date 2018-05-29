package com.workspaceit.test.service;

import com.workspaceit.test.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
