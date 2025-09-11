package com.java8.session3;

import java.util.Optional;
import java.util.function.Supplier;

class CityNotFoundEx extends RuntimeException {
}

public class DemoOptional {
	// raj
	public static void main(String[] args) {
		String data = null;
		// Optional<String> opString=Optional.of(data);
		Optional<String> opString = Optional.ofNullable(data);

		// anti pattern : code that should be avoided
		if (opString.isPresent()) {
			String dataValue = opString.get();
			System.out.println(dataValue);
		}

		//Correct uses
		// System.out.println(opString.orElse("not found"));

		// Optional<String> cityNameOptional=getCity(43545);

//		String name = cityNameOptional.orElse("not found");

//		String name = cityNameOptional.orElseThrow(()-> new CityNotFoundEx());

		// java 8 in actions
//		String name = cityNameOptional.orElse("city not found");
//		
//		
//		System.out.println(name);
	}

//	//ravi
	public static Optional<String> getCity(int cordinate) {
		//
		//
		String cityName = null;

		return Optional.ofNullable(cityName);
	}
}
