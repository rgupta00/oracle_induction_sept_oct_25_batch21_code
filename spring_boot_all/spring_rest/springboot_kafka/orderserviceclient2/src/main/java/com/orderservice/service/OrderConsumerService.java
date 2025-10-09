package com.orderservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.orderservice.dto.ProductDto;

@Service
public class OrderConsumerService {

	private KafkaTemplate<String, Object> kafkaTemplate;

	@Value("${kafka.topic}")
	private String topicName;
	
	public OrderConsumerService(KafkaTemplate<String, Object> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@KafkaListener(topics = "order-events1", groupId = "my_topic_group_id")
	public void processMessage1(Object productDto) {
		System.out.println(productDto);
	}
	

}
