package com.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//pagination
	@GetMapping(path="hello2")
	public String hello2(@RequestParam("name")String name, @RequestParam(name="city")String city) {
		return "hello champ! "+ name +" and you are from "+ city;
	}

	@GetMapping(path="hello/{name}/{city}")
	public String hello(@PathVariable("name")String name, @PathVariable(name="city")String city) {
		return "hello champ! "+ name +" and you are from "+ city;
	}
}
