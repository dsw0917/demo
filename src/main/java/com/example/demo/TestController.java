package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellen
 * @version 1.0
 * @date 2018/10/23
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/he")
    public String he(){

        return "he";
    }

}
