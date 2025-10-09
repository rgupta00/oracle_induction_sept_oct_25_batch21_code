// OrderService.java
package com.orderapp.services;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.orderapp.events.OrderCreatedEvent;

@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void createOrder(String orderId) {
        System.out.println("✅ Order created: " + orderId);
        // publish order created event
        try {
        	Thread.sleep(5000);
        }catch(InterruptedException e) {}
        publisher.publishEvent(new OrderCreatedEvent(this, orderId));
    }
}

// ConfirmationService.java
