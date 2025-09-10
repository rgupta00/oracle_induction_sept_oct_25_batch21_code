package com.oracle.day3.session1.ex_handling.mcq;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	
	public void foo() throws Exception {
		System.out.println("foo method");
	}
}
class B extends A{
	//while doing overriding overriden method can not throw "bigger" ex
	@Override
	public void foo() throws IOException {
		System.out.println("foo method overriden");
	}
}

public class OverridingAndExHanding {
	public static void main(String[] args) {
		
		try {
			A a=new B();
			a.foo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




