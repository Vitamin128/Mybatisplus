package com.example.demo.test;

import org.springframework.stereotype.Service;

@Service
public class AlipayService implements PayService {
    public void contextLoads() {
        System.out.println("AlipayService contextLoads");
    }
}
