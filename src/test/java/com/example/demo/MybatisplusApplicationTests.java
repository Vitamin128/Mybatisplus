package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.Orders;
import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.OrdersService;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import tools.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    UserService UserService;

    @Autowired
    OrdersService OrdersService;

//    @Autowired
//    UserMapper userMapper;

    @Test
    void contextLoads() {
//        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<User>();
//        wrapper.between(User::getAge,20,30).eq(User::getStatus,"ACTIVE");
//        List<User> object=UserService.list(wrapper);
//        System.out.println(object);
//        ObjectMapper objectMapper=new ObjectMapper();
//
//        Page<User> user=Page.of(0,3);
//        Page<User> result= UserService.page(user);
//        User user1=result.getRecords().get(1);
//        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result.getRecords()));
//        Orders orders=new Orders();
//        orders.setId(5L);
//        orders.setUpdateTime(LocalDateTime.now());

//        OrdersService.updateById(orders);
//        User userdemo=userMapper.SelectUserById(2);
//        System.out.println(userdemo);
        System.out.println(UserService.SelectUserById(4));
    }
}
