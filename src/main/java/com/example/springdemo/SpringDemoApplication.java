package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springdemo", "controller", "mail"})
public class SpringDemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello World Suraj");
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}