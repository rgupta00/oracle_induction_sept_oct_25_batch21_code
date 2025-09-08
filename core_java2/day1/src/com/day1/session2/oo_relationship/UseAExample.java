package com.day1.session2.oo_relationship;

//a trainer named raj using marker to teach
class Marker{
	
	public void write(String topic) {
		System.out.println(topic);
	}
}
class Trainer {
	private String name;

	public Trainer(String name) {
		this.name = name;
	}
	public void teaching(Marker marker, String subject) {
		System.out.println("trainer named Mr. "+ name +" is teaching us");
		marker.write(subject);
	}
}

public class UseAExample {

	public static void main(String[] args) {
		Marker marker=new Marker();
		Trainer trainer=new Trainer("raj");
		trainer.teaching(marker, "basics of oo in java");
		
	}
}
