package com.xiaohai.qingsonguser.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 肖云涛
 * @Date: 2024/7/7 13:13
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/list")
    public String list(){
        return "hello";
    }

}
