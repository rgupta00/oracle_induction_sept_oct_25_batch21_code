package com.day2.session1;

import java.util.Scanner;

//ooad
//passanger name amit moving from BTM to banargatta using a bus
abstract class Vehicle {
	public abstract void move(String source, String destination);
}

class Bus extends Vehicle {
	public void move(String source, String destination) {
		System.out.println("moving from " + source + " to " + destination + " using bus");
	}
}

class Bike extends Vehicle {
	public void move(String source, String destination) {
		System.out.println("moving from " + source + " to " + destination + " using bike");
	}
}

class Metro extends Vehicle {
	public void move(String source, String destination) {
		System.out.println("moving from " + source + " to " + destination + " using metro");
	}
}

//OCP
class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(Vehicle vehicle, String source, String destination) {
		System.out.println("passanger name: " + name);
		vehicle.move(source, destination);
	}

}

public class DemoLooseCoupling {
	public static void main(String[] args) {
		// Bus b=new Bus();
		Vehicle vehicle;

		Scanner scanner = new Scanner(System.in);
		System.out.println("PE 1. bus 2. bike otherise 3. Metro");
		int value = scanner.nextInt();
		if (value == 1) {
			vehicle = new Bus();
		} else if (value == 2) {
			vehicle = new Bike();
		} else {
			vehicle = new Metro();
		}

		Passanger passanger = new Passanger("ravi");
		passanger.travel(vehicle, "BTM", "banargatta");
	}
}
