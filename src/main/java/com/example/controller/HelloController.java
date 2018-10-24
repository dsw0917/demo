package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellen
 * @version 1.0
 * @date 2018/10/23
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "Spring Boot程序";
    }

}
