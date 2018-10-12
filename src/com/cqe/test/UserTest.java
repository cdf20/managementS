package com.cqe.test;

import com.cqe.dao.ResumeDao;
import com.cqe.dao.UserDao;
import com.cqe.entity.Resume;
import com.cqe.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/10/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTest {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ResumeDao resumeDao;
    @Test
    public void insertUser(){
        userDao.insertUser(new User(-1,"123","11","1"));
    }
    @Test
    public void insertResume(){
        Resume resume = new Resume(-1,"aa","男",18,"人事部","电力","5年","大专","三峡","123456","12345");
        resumeDao.insertResume(resume);
    }
}
