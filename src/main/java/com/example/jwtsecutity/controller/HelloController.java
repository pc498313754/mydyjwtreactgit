package com.example.jwtsecutity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

//    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    @PostMapping
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("222222222222");
        return "world";
    }

}
