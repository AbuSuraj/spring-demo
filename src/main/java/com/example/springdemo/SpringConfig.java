package com.example.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class SpringConfig {

    // Choose which MailSender implementation to use
//    @Bean
//    public MailSender mailSender() {
//        // Return MockMailSender for testing
//        return new MockMailSender();
//
//        // Or return SmtpMailSender for real emails
//        // return new SmtpMailSender();
//    }
}