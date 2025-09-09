package com.day2.session;

import java.util.Scanner;

//overrding
//abs class: aka incomplete class
//that incomplete is completed by drived class

//there are 2 ways to create abstruction in java: interface vs abs class
interface Shape{
	public abstract void printArea() ;
}

class Rectangle implements Shape{
	
	@Override
	public void printArea() {
		System.out.println("L X B");
	}

}
class Circle implements Shape{
	
	@Override
	public void printArea() {
		System.out.println("area is PI X  r X r");
	}
}
class Triangle implements Shape{
	
	@Override
	public void printArea() {
		System.out.println("area is 0.5 X  b X h");
	}
}
class Square implements Shape{
	
	@Override
	public void printArea() {
		System.out.println("area is L X L");
	}
}
public class A_DemoOverriding {

	public static void main(String[] args) {
		
			
		//code flexiblity
		Shape shape=null;
		System.out.println("PE 1. for circle 2. Triangle 3.any other shape");
		Scanner scanner=new Scanner(System.in);
		int choice= scanner.nextInt();
		if(choice==1) {
			shape=new Circle();
		}else if(choice==2) {
			shape=new Triangle();
		}else {
			shape=new Square();
		}
		shape.printArea();
	}
}
