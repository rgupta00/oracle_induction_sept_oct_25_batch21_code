package com.java8.session1.ex0.interface_evolutions;
/*
    Java 8 interface evolution
    diamond problem in interface
    functional interface

 */
//java 8: u can add default method
// u can add static method

//from java 8  interface was 100% abstraction?
interface Foo{
  public static final int i=0;
  public  abstract void foo();
  
  public default void fooDefault() {
	  System.out.println("u can have default method inside the interface");
  }

  public static void fooStatic() {
	  System.out.println("interface can have static method ");
  }
}


////till java 7 interface was 100% abstraction?
//interface Foo{
//    public static final int i=0;
//    public  abstract void foo();
//
//}

public class A_BasicOfInterfaceEvolution {
    public static void main(String[] args) {

    
//        foo.fooDefault();
//
//        Foo.fooStatic();
    }
}


















