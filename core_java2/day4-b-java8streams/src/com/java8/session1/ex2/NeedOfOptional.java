package com.java8.session1.ex2;

import java.util.Optional;
import java.util.function.Supplier;

class EmpNotFoundEx extends RuntimeException{
    public EmpNotFoundEx(String message) {
        super(message);
    }
    public EmpNotFoundEx(){
    }
}

public class NeedOfOptional {
    public static void main(String[] args) {
    		//Optional in java 8
//    	Optional<Emp> empOp=getById(1211);
//    	String name= empOp.map(e-> e.getName())
//    			.orElseThrow(()-> new EmpNotFoundEx("emp not found"));
//    	System.out.println(name);
    	
    	Optional<Emp> empOp=getById(1211);
    	String name= empOp.map(e-> e.getName())
    			.orElse("name not found");
    	System.out.println(name);
    	
    }

    
    
    
    public static Optional<Emp> getById(int id) {
    	//he is cheking using jdbc and then giving me that emp object
        return Optional.ofNullable(new Emp(1, "sumit", 5000));
    }
}












