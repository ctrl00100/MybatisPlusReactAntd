package com.example.my.mybatispp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.my.mybatispp.mapper")
public class MybatisppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisppApplication.class, args);
    }

}
