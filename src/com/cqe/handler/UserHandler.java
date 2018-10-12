package com.cqe.handler;

import com.cqe.entity.User;
import com.cqe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/10/12.
 */
@Controller
public class UserHandler {
    @Autowired
    private UserService userService;
    @RequestMapping("findUser")
    @ResponseBody
    public String deleteStudentById(String name){
        User user = userService.queryUserByName(name);
        if (name==null){
            return "";
        }else {
            if (user == null) {
                return "111";
            } else {
                return "666";
            }
        }
    }
    @RequestMapping("addUser")
    public String addUser(User user){
        System.out.println("1111");
        user.setId(-1);
        user.setIsAdmin("1");
        userService.insertUser(user);
        return "login";
    }
}
