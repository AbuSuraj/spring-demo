package com.example.springdemo;

import mail.MailSender;
import mail.MockMailSender;
import mail.SmtpMailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    // Choose which MailSender implementation to use
    @Bean
    public MailSender mailSender() {
        // Return MockMailSender for testing
        return new MockMailSender();

        // Or return SmtpMailSender for real emails
        // return new SmtpMailSender();
    }
}