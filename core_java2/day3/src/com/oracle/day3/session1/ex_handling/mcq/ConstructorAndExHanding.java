package com.oracle.day3.session1.ex_handling.mcq;

import java.io.FileNotFoundException;
import java.io.IOException;

class X {
	X() throws IOException {
		System.out.println("ctr of class X");
	}
}

class Y extends X {
	Y() throws Exception {
		super();
		System.out.println("ctr of class Y");
	}
}

public class ConstructorAndExHanding {
	public static void main(String[] args) {
		try {
			X x = new Y();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
