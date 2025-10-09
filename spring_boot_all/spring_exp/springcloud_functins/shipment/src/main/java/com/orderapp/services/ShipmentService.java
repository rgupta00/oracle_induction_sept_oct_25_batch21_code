package com.orderapp.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.orderapp.dto.OrderConfirmed;

@Service
public class ShipmentService {

	@KafkaListener(topics = "order-confirmed", groupId = "notification-group")
	public void notifyCustomer(OrderConfirmed confirmed) {
		System.out.println(
				"📧 Sending notification for Order: " + confirmed.getOrderId() + " Status: " + confirmed.getStatus());
	}
}
