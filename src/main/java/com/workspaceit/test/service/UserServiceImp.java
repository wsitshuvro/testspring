package com.workspaceit.test.service;

import com.workspaceit.test.dao.UserDao;
import com.workspaceit.test.entity.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user)
    {
        userDao.add(user);
    }

    @Transactional
    @Override
    public List<User> listUsers()
    {
        return userDao.listUsers();
    }

}
