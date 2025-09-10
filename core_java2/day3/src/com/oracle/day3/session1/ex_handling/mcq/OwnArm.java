package com.oracle.day3.session1.ex_handling.mcq;

class Door implements AutoCloseable{
	@Override
	public void close() {
		System.out.println("close the door");
		if(1==1) {
			throw new ArithmeticException("Arthimatic ex");
		}
	}
	public void openDoor() {
		System.out.println("open the door");
		if(1==1)
			throw new NullPointerException("npe");
	}
}
public class OwnArm {
	
	public static void main(String[] args) {
		{
			try(Door d=new Door()){
				d.openDoor();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				Throwable[] suppressed = e.getSuppressed();
				for(Throwable t: suppressed) {
					System.out.println(t.getMessage());
				}
			}
		}
	}

}
