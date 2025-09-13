package com.example.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(String orderId, Double amount){
        System.out.println("Processing payment...");
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: $" + amount);

        boolean success = amount >0;
        if(success){
            System.out.println("Payment successful!");
        }else{
            System.out.println("Payment failed!");
        }
        return success;
    }
}
