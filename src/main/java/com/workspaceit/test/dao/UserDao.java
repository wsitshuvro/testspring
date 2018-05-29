package com.workspaceit.test.dao;

import com.workspaceit.test.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
}
