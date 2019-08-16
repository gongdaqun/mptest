package com.ng5.mptest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ng5.mptest.dao"})
public class MptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MptestApplication.class, args);
    }

}
