package com.orderapp.services;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.serializer.JsonSerde;

import com.orderapp.dto.Order;
import com.orderapp.dto.OrderConfirmed;

@Configuration
public class ConfirmationStream {

    @Bean
    public KStream<String, OrderConfirmed> processOrders(StreamsBuilder builder) {
        KStream<String, Order> ordersStream = builder.stream(
            "orders",
            Consumed.with(Serdes.String(), new JsonSerde<>(Order.class))
        );

        KStream<String, OrderConfirmed> confirmedStream = ordersStream.mapValues(order -> {
            OrderConfirmed confirmed = new OrderConfirmed();
            confirmed.setOrderId(order.getOrderId());
            confirmed.setStatus("CONFIRMED");
            System.out.println("✅ Order confirmed: " + order.getOrderId());
            return confirmed;
        });

        confirmedStream.to(
            "order-confirmed",
            Produced.with(Serdes.String(), new JsonSerde<>(OrderConfirmed.class))
        );

        return confirmedStream;
    }
}
