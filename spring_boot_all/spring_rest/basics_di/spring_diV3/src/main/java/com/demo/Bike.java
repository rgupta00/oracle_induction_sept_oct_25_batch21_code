package com.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//<bean id="v1" class="com.demo.Bike"/>
@Component(value = "v1")
@Profile("test")
public class Bike implements Vehical {
	@Override
	public void move() {
		System.out.println("moving on a bike");
	}
}
