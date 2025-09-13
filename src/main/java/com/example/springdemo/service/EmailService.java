package com.example.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendConfirmationEmail(String customerEmail, String orderDetails){


        System.out.println("📧 Sending email to: " + customerEmail);
        System.out.println("Order details: " + orderDetails);
        System.out.println("Email sent successfully!\n");
    }
}
