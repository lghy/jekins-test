package com.wkf.test.controller;

import com.wkf.test.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangkaifei
 * @Date 2022/8/15
 * @Version 1.0
 **/
@RestController("/user")
public class UserController {
    List list = new ArrayList();

    @RequestMapping("create")
    public String createUser(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1000000;  ;i++) {
            sb.append(i*i);
            User user = new User("name"+sb.toString(),"man",18);
        }
    }

    @RequestMapping("add")
    public String add(){
        byte[] by = new byte[1024 * 1024];
        list.add(by);
        return "add success";
    }
}
