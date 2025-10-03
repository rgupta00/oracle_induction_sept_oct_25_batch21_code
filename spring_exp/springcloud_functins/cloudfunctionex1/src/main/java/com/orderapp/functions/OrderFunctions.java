package com.orderapp.functions;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.orderapp.dto.OrderConfirmation;
import com.orderapp.dto.OrderRequest;
import com.orderapp.dto.OrderResponse;

@Configuration
public class OrderFunctions {

	@Bean
	Consumer<OrderResponse> orderNotifier(){
		return (OrderResponse response)-> {
				 System.out.println("📧 Sending email: Order " 
				            + response.getOrderId() + " is " + response.getStatus());
			
		};
	}
    // Transform order request into order confirmation
	@Bean
     Function<OrderRequest, OrderConfirmation> processOrder() {
        return orderRequest -> {
            // 1. Validate stock
            if(orderRequest.getQuantity() <= 0) throw new IllegalArgumentException("Invalid quantity");

            // 2. Save order in DB (pseudo code)
            Long orderId = saveOrderToDB(orderRequest);

            // 3. Create confirmation
            OrderConfirmation confirmation = new OrderConfirmation();
            confirmation.setOrderId(orderId);
            confirmation.setStatus("CONFIRMED");
            return confirmation;
        };
    }

    private Long saveOrderToDB(OrderRequest orderRequest) {
        // Simulate DB save
        return System.currentTimeMillis(); // fake order ID
    }
}