package com.jiaxin.springbootdemo.mapper;
import com.jiaxin.springbootdemo.po.User;
import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
