package com.orderservice.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductService {

	private KafkaTemplate<String, String> kafkaTemplate;

	public ProductService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void produce(String message) {
		
		CompletableFuture<SendResult<String, String>> future = 
				kafkaTemplate.send("t-hello2", message);
		
		future.whenComplete(((result, ex) -> {
            if(ex==null){
                System.out.println(result.getRecordMetadata().hasOffset());//:)
            }else {
                System.out.println(ex.getMessage());
            }
        }));
	}
	
}
