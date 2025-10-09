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
	public Function<OrderRequest, OrderResponse> processOrder() {
		return req -> {
			OrderResponse res = new OrderResponse();
			res.setOrderId(System.currentTimeMillis());
			res.setItem(req.getItem());
			res.setStatus("CONFIRMED");
			return res;
		};
	}

	// Consumer: Send notification
	@Bean
	public Consumer<OrderResponse> notifyCustomer() {
		return res -> {
			System.out.println("📧 Email sent: Order " + res.getOrderId() + " is " + res.getStatus());
		};
	}

	// Supplier: Generate random order IDs
	@Bean
	public Supplier<Long> orderIdGenerator() {
		return () -> System.currentTimeMillis();
	}

}
