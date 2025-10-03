package com.orderapp.events;

import org.springframework.context.ApplicationEvent;

public class OrderConfirmedEvent extends ApplicationEvent {
    private final String orderId;

    public OrderConfirmedEvent(Object source, String orderId) {
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}
