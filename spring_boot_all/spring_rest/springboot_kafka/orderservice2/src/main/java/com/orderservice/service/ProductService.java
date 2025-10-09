package com.orderservice.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.orderservice.dto.ProductDto;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductService {

	private KafkaTemplate<String, Object> kafkaTemplate;

	@Value("${kafka.topic}")
	private String topicName;
	
	public ProductService(KafkaTemplate<String, Object> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void produce(ProductDto productDto) {
		
		CompletableFuture<SendResult<String, Object>> future = 
				kafkaTemplate.send(topicName, productDto);
		
		future.whenComplete(((result, ex) -> {
            if(ex==null){
                System.out.println(result.getRecordMetadata().hasOffset());//:)
            }else {
                System.out.println(ex.getMessage());
            }
        }));
	}
	
}
