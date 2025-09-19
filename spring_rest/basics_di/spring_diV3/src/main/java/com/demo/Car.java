package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//<bean id="v2" class="com.demo.Car" primary="true"/>
@Component(value = "v2")
@Profile("dev")
public class Car implements Vehical {
	@Override
	public void move() {
		System.out.println("moving in a car");
	}
}
