package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class UserController {

// @Autowired
    final private UserService service;
    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "addUserInfo",method = RequestMethod.GET)
    public Response addUserInfo(){
        service.addUserInfo();
        Response res = new Response();
        res.setMsg("添加成功");
        res.setCode(1);
        return res;
    }

}
