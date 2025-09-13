package com.example.springdemo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private  final EmailService emailService;
    private final PaymentService paymentService;


    public OrderService(EmailService emailService, PaymentService paymentService) {
        this.emailService = emailService;
        this.paymentService = paymentService;
        System.out.println(" OrderService created with dependencies injected");
    }

    @PostConstruct
    public void init() {
        System.out.println(" OrderService initialized and ready!\n");
    }

    public  void processOrder(String orderId,String customerEmail, Double amount){
        System.out.println("📦 Processing order: " + orderId);
      boolean paymentSuccess = paymentService.processPayment(orderId, amount);
      if(paymentSuccess){
          String orderDetails = "Order #" + orderId + " - Amount: $" + amount;
          emailService.sendConfirmationEmail(customerEmail, orderDetails);
          System.out.println("✅ Order " + orderId + " processed successfully!\n");
      }else{
          System.out.println("Payment failed for order: " + orderId);
      }
    }
    @PreDestroy
    public void cleanup() {
        System.out.println("🧹 OrderService cleanup - releasing resources");
    }

}
