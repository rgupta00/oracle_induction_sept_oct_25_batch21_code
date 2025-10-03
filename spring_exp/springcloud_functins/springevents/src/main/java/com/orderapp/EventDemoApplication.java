package com.orderapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.orderapp.services.OrderService;

@SpringBootApplication
@EnableAsync
public class EventDemoApplication implements CommandLineRunner {
	@Autowired
    private  OrderService orderService;


    public static void main(String[] args) {
        SpringApplication.run(EventDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        orderService.createOrder("ORDER-123");
        System.out.println("done");
    }
}
