package com.orderapp.services;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.orderapp.events.OrderConfirmedEvent;
import com.orderapp.events.OrderCreatedEvent;

@Service
public class ConfirmationService {

    private final ApplicationEventPublisher publisher;

    public ConfirmationService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Async
    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("📧 Sending confirmation for order: " + event.getOrderId());
        publisher.publishEvent(new OrderConfirmedEvent(this, event.getOrderId()));
    }
}

// ShipmentService.java
