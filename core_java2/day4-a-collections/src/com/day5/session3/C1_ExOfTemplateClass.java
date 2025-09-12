package com.day5.session3;
class MyClass<T1, T2>{
	T1 i;
	T2 j;
	
	public T2 getJ() {
		return j;
	}
	public void setJ(T2 j) {
		this.j = j;
	}
	
	public T1 getI() {
		return i;
	}
	public void setI(T1 i) {
		this.i = i;
	}
}
public class C1_ExOfTemplateClass {

	public static void main(String[] args) {
//		MyClass<String, String> m=new MyClass<>();
//		m.setI("rajeev");
//		m.setJ("gupta");
//		System.out.println(m.getI());
//		System.out.println(m.getJ());
		
		MyClass<Integer, Double> m=new MyClass<>();
		m.setI(12);
		m.setJ(77.9);
		System.out.println(m.getI());
		System.out.println(m.getJ());
	}
}
