package com.orderapp.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.orderapp.dto.Order;

@Service
public class OrderService {

	private final KafkaTemplate<String, Order> kafkaTemplate;

    public OrderService(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void createOrder(Order order) {
        kafkaTemplate.send("orders", order.getOrderId(), order);
        System.out.println("✅ Order created: " + order.getOrderId());
    }
}
