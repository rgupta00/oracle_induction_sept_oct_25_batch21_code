package com.day2.session;
interface X1{
	int i=77;
	void foo();
}
interface X2{
	int i=777;
	void foo() ;
}
class M implements X1, X2{
	@Override
	public void foo() {
		System.out.println(X2.i);
	}
}

public class D_InterfaceDiamondProblem {

	public static void main(String[] args) {
		
	}
}
