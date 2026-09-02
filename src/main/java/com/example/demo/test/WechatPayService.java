package com.example.demo.test;

import org.springframework.stereotype.Service;

@Service
public class WechatPayService implements PayService {
    public  void contextLoads() {
        System.out.println("WechatPayService contextLoads");
    }
}
