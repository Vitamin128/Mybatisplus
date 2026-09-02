package com.example.demo.service.Impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.example.demo.dao.Product;
import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl
        extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Override
    public User SelectUserById(int id) {
        return baseMapper.SelectUserById(id);
    }

    @Override
    public List<User> SelectUserByStatus(String status)
    {
        return baseMapper.SelectUserByStatus(status);
    }

    @Override
    public List<Product> SelectProductById(int id)
    {
        return baseMapper.SelectProductById(id);
    }

    @Override
    public int InsertUser(String username,int age)
    {
        return baseMapper.InsertUser(username,age);
    }
}
