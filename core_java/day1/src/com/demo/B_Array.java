package com.demo;
class Dog{
	public void sound() {
		System.out.println("bho bho");
	}
}
public class B_Array {

	public static void main(String[] args) {
		Dog dogs[]=new Dog[5];
		
		dogs[0]=new Dog();
		dogs[1]=new Dog();
		dogs[2]=new Dog();
		dogs[3]=new Dog();
		dogs[4]=new Dog();
		
		
		for(Dog d: dogs) {
			d.sound();
		}
	}
}
