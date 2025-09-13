package com.example.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.example.springdemo.service.OrderService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springdemo"})
public class SpringDemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello World Suraj");
//        SpringApplication.run(SpringDemoApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("=== Spring Container Created ===\n");
        OrderService orderService = context.getBean(OrderService.class);

        System.out.println("=== Processing Orders ===\n");

        // Use the service - notice we didn't create any dependencies manually!
        orderService.processOrder("ORD-001", "customer@example.com", 299.99);
        orderService.processOrder("ORD-002", "user@test.com", 150.00);
        orderService.processOrder("ORD-003", "buyer@shop.com", -10.0); // This will fail

        System.out.println("=== Shutting Down Application ===");

        // Close the context to trigger @PreDestroy methods
        ((AnnotationConfigApplicationContext) context).close();

        System.out.println("Application finished!");

    }
}