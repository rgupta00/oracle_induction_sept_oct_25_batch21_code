package com.day5.session3;
//hotel 
interface Flowable{
}


class Juice implements Flowable, Drinkable{
}
class Water implements Flowable, Drinkable{
}
interface Drinkable{
	
}
class Cake{
}

class Petrol implements Flowable{
}




//class Glass<T extends Flowable & Drinkable>{
//	private T liquid;
//
//	public T getLiquid() {
//		return liquid;
//	}
//
//	public void setLiquid(T liquid) {
//		this.liquid = liquid;
//	}
//}
//hotel : sw Glass 

class Glass<T extends Flowable & Drinkable>{
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
}
public class E_GenericsAndBL {
	
	public static void main(String[] args) {
		
		
		Glass<Juice> glass=new Glass<>();
	
		
		
//		
//		Glass<Water> glass=new Glass<>();
//		glass.setLiquid(new Water());
//		Water w=glass.getLiquid();
		
//		Glass<Petrol> g2=new Glass<>();

		
		
		
//		Glass glass=new Glass();
//		glass.setObject(new Juice());
//		Juice juice=(Juice) glass.getObject();
//		
//		glass.setObject(new Water());
		
	}

}
