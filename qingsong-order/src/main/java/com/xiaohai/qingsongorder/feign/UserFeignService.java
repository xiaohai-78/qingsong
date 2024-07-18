package com.xiaohai.qingsongorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "qingsong-user", path = "/user")
public interface UserFeignService {

    @PostMapping("/list")
    String list();
}
