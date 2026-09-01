package com.example.demo.service.Impl;

import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.example.demo.dao.OrderItem;
import com.example.demo.mapper.OrderItemMapper;
import com.example.demo.service.OrderItemService;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl
        extends ServiceImpl<OrderItemMapper, OrderItem>
        implements OrderItemService {
}