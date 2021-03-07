package com.lagou.demo_mybatis01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lagou.dao")
public class DemoMybatis01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatis01Application.class, args);
    }

}
