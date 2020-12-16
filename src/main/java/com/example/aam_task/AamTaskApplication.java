package com.example.aam_task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.aam_task.Mapper")
public class AamTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(AamTaskApplication.class, args);
    }

}
