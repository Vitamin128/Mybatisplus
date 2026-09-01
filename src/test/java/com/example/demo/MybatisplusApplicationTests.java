package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    UserService UserService;

    @Test
    void contextLoads() {
        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<User>();
        wrapper.eq(User::getStatus,"AVTIVE").eq(User::getDeleted,0);
        List<User> object=UserService.list(wrapper);
        System.out.println(object.size());
    }
}
