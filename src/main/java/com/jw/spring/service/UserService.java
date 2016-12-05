package com.jw.spring.service;


import com.jw.spring.entity.User;
import com.jw.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jw on 16-12-3.
 */
@Service
public class UserService{

    @Autowired
    private UserMapper mapper;


    public User findUserInfo() {
        return mapper.findUserInfo();
    }
}
