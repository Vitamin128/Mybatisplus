package com.example.demo.service.Impl;

import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.example.demo.dao.Orders;
import com.example.demo.mapper.OrdersMapper;
import com.example.demo.service.OrdersService;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl
        extends ServiceImpl<OrdersMapper, Orders>
        implements OrdersService {
}