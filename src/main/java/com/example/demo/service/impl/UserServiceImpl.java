package com.example.demo.service.impl;

//import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {
//    @Autowired

    final UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void addUserInfo(){
        String username = "jack";
        int password = 123;
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        userMapper.addUserInfo(user);
    }


}
