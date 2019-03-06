package com.trista.springdemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@EnableAutoConfiguration //用于自动配置，判断出这是一个web应用，会创建出相应的web环境

public class DashboardController {

    @RequestMapping("/dashboard")

    private String index(){

        return "Hello World!";

    }
}
