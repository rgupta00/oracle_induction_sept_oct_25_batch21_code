package com.productapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {
	//spring hey i want to use in merory cache
	@Bean
	 CacheManager cacheManager () {
		ConcurrentMapCacheManager cacheManager=new ConcurrentMapCacheManager("products");
		return cacheManager;
	}

}
