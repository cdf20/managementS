package com.cqe.service.impl;

import com.cqe.dao.UserDao;
import com.cqe.entity.User;
import com.cqe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
//@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> queryAllUsers() {
        return userDao.queryAllUsers();
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public User queryUserByName(String name) {
        return userDao.queryUserByName(name);
    }

    @Override
    public void updateUserById(User user) {
        userDao.updateUserById(user);
    }
}
