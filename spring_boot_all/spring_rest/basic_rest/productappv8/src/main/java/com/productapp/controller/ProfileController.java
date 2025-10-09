package com.productapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value("${db.type}")
	private String dbType;
	
	@GetMapping(path = "value")
	public String getValue() {
		return dbType;
	}
	
}
