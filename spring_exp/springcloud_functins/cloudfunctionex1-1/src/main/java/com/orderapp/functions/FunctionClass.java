package com.orderapp.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.orderapp.dto.OrderConfirmation;
import com.orderapp.dto.OrderRequest;
import com.orderapp.dto.OrderResponse;

@Configuration
public class FunctionClass {
	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Consumer<String> logMessage() {
		return message -> System.out.println("Received message: " + message);
	}

	// Supplier: produces output, no input
	@Bean
	public Supplier<String> greet() {
		return () -> "Hello from Supplier at " + java.time.LocalDateTime.now();
	}

	// Transform order request into order confirmation
	@Bean
	Function<OrderRequest, OrderConfirmation> processOrder() {
		return orderRequest -> {
			// 1. Validate stock
			if (orderRequest.getQuantity() <= 0)
				throw new IllegalArgumentException("Invalid quantity");

			// 2. Save order in DB (pseudo code)
			Long orderId = saveOrderToDB(orderRequest);

			// 3. Create confirmation
			OrderConfirmation confirmation = new OrderConfirmation();
			confirmation.setOrderId(orderId);
			confirmation.setStatus("CONFIRMED");
			return confirmation;
		};
	}

	@Bean
	Consumer<OrderResponse> orderNotifier() {
		return (OrderResponse response) -> {
			System.out.println("📧 Sending email: Order " + response.getOrderId() + " is " + response.getStatus());

		};
	}

	private Long saveOrderToDB(OrderRequest orderRequest) {
		// Simulate DB save
		return System.currentTimeMillis(); // fake order ID
	}

}
