package com.xiaohai.qingsongorder.controller;

import com.xiaohai.qingsongorder.feign.UserFeignService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private UserFeignService userFeignService;

    @PostMapping("/list")
    public String list(){
        return "OrderController say hello";
    }

    @PostMapping("/feign/user")
    public String feignUser(){
        return "feignUser say hello " + userFeignService.list();
    }
}