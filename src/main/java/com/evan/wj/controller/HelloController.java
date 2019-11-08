package com.evan.wj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")//相应这个页面的请求
    public String hello(){
        return "哈哈啊哈哈啊哈哈";
    }
}
