package com.example.demo.service;

import com.baomidou.mybatisplus.spring.service.IService;
import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService
        extends IService<User> {
    User SelectUserById(int id);
    List<User> SelectUserByStatus(String status);
}