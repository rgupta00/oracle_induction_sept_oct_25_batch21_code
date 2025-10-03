package com.orderapp.services;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.serializer.JsonSerde;

import com.orderapp.dto.OrderConfirmed;
import com.orderapp.dto.Shipment;

@Configuration
public class ShipmentStream {

    @Bean
    public KStream<String, Shipment> processConfirmedOrders(StreamsBuilder builder) {
        KStream<String, OrderConfirmed> confirmedStream = builder.stream(
            "order-confirmed",
            Consumed.with(Serdes.String(), new JsonSerde<>(OrderConfirmed.class))
        );

        KStream<String, Shipment> shipmentStream = confirmedStream.mapValues(orderConfirmed -> {
            Shipment shipment = new Shipment();
            shipment.setOrderId(orderConfirmed.getOrderId());
            shipment.setStatus("SHIPPED");
            System.out.println("🚚 Order shipped: " + orderConfirmed.getOrderId());
            return shipment;
        });

        shipmentStream.to(
            "shipment",
            Produced.with(Serdes.String(), new JsonSerde<>(Shipment.class))
        );

        return shipmentStream;
    }
}
