package com.wkf.test.controller;

import com.wkf.test.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangkaifei
 * @Date 2022/8/15
 * @Version 1.0
 **/
@RestController("/user")
public class UserController {

    @RequestMapping("create")
    public String createUser(){
        for (int i = 0;  ;i++) {
            User user = new User("name"+i,"man",18);
        }
//        return "create user success !";
    }
}
