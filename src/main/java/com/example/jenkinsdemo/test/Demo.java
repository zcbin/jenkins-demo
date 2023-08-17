package com.example.jenkinsdemo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zhang Chengbin
 * @date: 2023/8/10
 * @Copyright：Copyright ® 掌控网络. All rights reserved.
 */
@RestController
@RequestMapping("/demo")
public class Demo {
    @RequestMapping("/hello")
    public String hello(@RequestParam String hello) {
        return "hello11:" + hello;
    }
}
