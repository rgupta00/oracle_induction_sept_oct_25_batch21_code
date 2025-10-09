package com.orderservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

	private KafkaTemplate<String, String> kafkaTemplate;

	
	public OrderConsumerService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@KafkaListener(topics = "order-events", groupId = "my_topic_group_id", topicPartitions
			= {@TopicPartition(topic = "order-events", partitions = {"2"})})
	public void processMessage1(String message) {
		System.out.println(message);
	}
	
	@KafkaListener(topics = "order-events", groupId = "my_topic_group_id", topicPartitions
			= {@TopicPartition(topic = "order-events", partitions = {"1"})})
	public void processMessage2(String message) {
		System.out.println(message);
	}
	
}
