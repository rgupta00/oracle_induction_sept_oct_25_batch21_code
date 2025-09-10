package com.day2.java5;
class Logic{
	@Deprecated
	void logic() {
		System.out.println("old logic of project 2010");
	}
}
class NewLogic extends Logic{
	
	void logicNew() {
		System.out.println("old logic of project 2010");
	}
}
public class F_Annotations {

	public static void main(String[] args) {
		Logic logic=new Logic();
		logic.logic();
	}
}
