package com.cqe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/12.
 */
public class User implements Serializable{
    private Integer id;//员工编号
    private String name;//员工名
    private String password;//密码
    private String isAdmin;//是否为管理员

    public User() {
    }

    public User(Integer id, String name, String password, String isAdmin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                '}';
    }
}
