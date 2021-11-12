package com.jiaxin.springbootdemo.mapper;
import com.jiaxin.springbootdemo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findAll();
}
