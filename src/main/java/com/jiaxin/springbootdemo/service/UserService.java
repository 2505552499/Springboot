package com.jiaxin.springbootdemo.service;

import com.jiaxin.springbootdemo.mapper.UserMapper;
import com.jiaxin.springbootdemo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
