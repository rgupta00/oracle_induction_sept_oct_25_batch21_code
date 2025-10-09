package com.productapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class InvalidationCacheService {

	@Autowired
	private ProductService productService;

	@Scheduled(cron = "0/30 * * * * *")
	public void invalidateCache() {
		log.info("^^^^^^^^^^^^^^^^^^^^^^cache is invalidated ");
		productService.invalidateCache();
	}
	
	
}
