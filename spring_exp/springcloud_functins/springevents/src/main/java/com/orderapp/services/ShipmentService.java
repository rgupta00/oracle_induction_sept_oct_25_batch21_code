package com.orderapp.services;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.orderapp.events.OrderConfirmedEvent;

@Service
public class ShipmentService {

	@Async
    @EventListener
    public void handleOrderConfirmed(OrderConfirmedEvent event) {
        try {
        	Thread.sleep(5000);
        }catch(InterruptedException e) {}
        System.out.println("🚚 Shipping order: " + event.getOrderId());
    }
}
