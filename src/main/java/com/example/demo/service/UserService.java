package com.example.demo.service;

import com.baomidou.mybatisplus.spring.service.IService;
import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Param;

public interface UserService
        extends IService<User> {
    User SelectUserById(int id);
}