package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.SpringBootService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SpringBootController {
    @Resource
    private SpringBootService service;

    @GetMapping("/hello")
    private String sayHello() throws InterruptedException {

        System.out.println("Come in my controller");

        service.asynTask1();
        service.asynTask2();
        service.asynTask3();
        return "hello";
    }
}
