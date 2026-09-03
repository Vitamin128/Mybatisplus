package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.Orders;
import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.OrdersService;
import com.example.demo.service.UserService;
import com.example.demo.tenum.category;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import tools.jackson.databind.ObjectMapper;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@Slf4j
class MybatisplusApplicationTests {

    @Test
    void contextLoads() {
//        for(int i=0;i<4;i++)
//        {
//            System.out.println(category.forCode(i));
//        }
        System.out.println(Orders.Say());
    }


}
