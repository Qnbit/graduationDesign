package com.example.graduationdesign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
