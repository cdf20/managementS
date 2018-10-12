package com.cqe.dao;

import com.cqe.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface UserDao {
    public List<User> queryAllUsers();
    public void insertUser(User user);
    public void deleteUserById(int id);
    public User queryUserByName(String name);
    public void updateUserById(User user);
}
