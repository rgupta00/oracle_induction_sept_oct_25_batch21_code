package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * 	<bean id="passanger" class="com.demo.Passanger" autowire="byType">
		<property name="name" value="amit"/>
	</bean>
 */
@Component(value = "passanger")
public class Passanger {
	
	@Value(value="amit")
	private String name;
	
	
	@Autowired //ctr injection
	 public Passanger(Vehical vehical) {
		this.vehical = vehical;
	}
	//field injection
	private Vehical vehical;
	
	 //settter injection
	public void setName(String name) {
		this.name = name;
	}
	//@Autowired
	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}
	public void travel() {
		System.out.println("name: "+ name);
		vehical.move();
	}
}
