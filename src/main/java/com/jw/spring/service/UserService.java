package com.jw.spring.service;


import com.jw.spring.entity.User;
import com.jw.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by jw on 16-12-3.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    @Cacheable(value = "usercache", keyGenerator = "smartGenerator")
    public User findUserInfo() {
        System.out.println("无缓存！");
        return mapper.findUserInfo();
    }
}
