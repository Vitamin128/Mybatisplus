package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.Orders;
import com.example.demo.dao.User;
import com.example.demo.service.OrdersService;
import com.example.demo.service.UserService;
import com.example.demo.test.PayService;
import jakarta.annotation.Resource;
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

//    @Autowired
//    UserService UserService;

//    @Autowired
//    OrdersService OrdersService;

//    @Resource
//    OrdersService ordersService;

    @Resource
    private PayService alipayService;

    @Test
    void contextLoads() {

        alipayService.contextLoads();
    }
}
