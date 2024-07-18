package com.xiaohai.qingsongorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QingsongOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(QingsongOrderApplication.class, args);
    }

}
