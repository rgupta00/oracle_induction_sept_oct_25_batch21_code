package com.productapp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyDemo{
	private MyDemo() {
		System.out.println("dare to call this");
	}
	public void doWork() {
		System.out.println("doing work");
	}
}
public class DemoOfJavaReflection {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		Class<MyDemo> class1=(Class<MyDemo>) Class.forName("com.productapp.MyDemo");
		Constructor[]constructors=class1.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		MyDemo demo=(MyDemo) constructors[0].newInstance(null);
		demo.doWork();
		
	}
}
