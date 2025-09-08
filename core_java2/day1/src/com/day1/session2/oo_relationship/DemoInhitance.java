package com.day1.session2.oo_relationship;
class A{
	private int i;
	A(int i){
		this.i=i;
	}
	public void print() {
		System.out.println("value of i: "+ i);
	}
}
class B extends A{
	private int j;
	B(int i, int j){
		super(i);
		this.j=j;
	}
	public void print() {
		super.print();
		System.out.println("j: "+ j);
	}
}
class C extends B{
	private int k;
	C(int i, int j, int k){
		super(i,j);
		this.k=k;
	}
	public void print() {
		super.print();
		System.out.println("k: "+ k);
	}
}
public class DemoInhitance {

	public static void main(String[] args) {
		C c=new C(1, 2, 3);
		c.print();
	}
}
