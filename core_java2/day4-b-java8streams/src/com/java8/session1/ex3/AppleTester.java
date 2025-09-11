package com.java8.session1.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTester {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400), 
						new Apple("green", 500), 
						new Apple("green", 200),
				new Apple("red", 450));
		// apples.forEach(a-> System.out.println(a));
		
		//Lambda vs method ref :: 
		//method ref is even more easy way to write lambda
		
		//Predicate<Apple> heavyPredicate = a -> a.getWeight() >= 400;

		Predicate<Apple> heavyPredicate =Apple::isHeavy;
		
		
		
		

		System.out.println("---------printing all heavy apples----------");
		List<Apple> heavyApplesList = AppleApp.getApplesOnCondition(apples, Apple::isHeavy);

		heavyApplesList.forEach(a -> System.out.println(a));
		
		System.out.println("---------printing all greens apples----------");

		Predicate<Apple> greenPredicate =Apple::isGreen;// a -> a.getColor().equals("green")

//		Predicate<Apple> greenPredicate2 =Apple::isGreen;
		Predicate<Apple> greenPredicate2 =AppleLogic::isHeavy;
		
		List<Apple> greenApplesList = AppleApp.getApplesOnCondition(apples, greenPredicate);
		greenApplesList.forEach(a-> System.out.println(a));

		System.out.println("heavy and green apples");
		
		Predicate<Apple> greenAndHeavyPredicate= heavyPredicate.and(greenPredicate);
		
		List<Apple> greenApplesAndHeavyApplesList = AppleApp.getApplesOnCondition(apples, greenAndHeavyPredicate);
		greenApplesAndHeavyApplesList.forEach(a-> System.out.println(a));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// T -->boolean
//			Predicate<Apple> heavyApplePredicate=a->a.getWeight()>=400;

//			Predicate<Apple> heavyApplePredicate=Apple::isHeavy;
//			Predicate<Apple> heavyApplePredicate2=AppleLogic::isHeavy;
//
//
//			System.out.println(heavyApplePredicate.test(new Apple("red",500)));
//
//			Predicate<Apple> greenApplePredicate=Apple::isGreen;
//

		// lamabda expression vs Method ref ::

//			apples.forEach(System.out::println);

//			Predicate<Apple> heavyApplePredicate=a->a.getWeight()>=400;
//			List<Apple>heavyApples=AppleApp.getAllApplesOnPredicate(apples, heavyApplePredicate);
//			heavyApples.forEach(a-> System.out.println(a));

//			Predicate<Apple> heavyApplePredicate=a->a.getWeight()>=400;
//			Predicate<Apple> greenApplePredicate=a->a.getColor().equals("green");
//			Predicate<Apple>greenAndHeavyPridate=heavyApplePredicate.and(greenApplePredicate);
//
//
//
//			List<Apple>greenAndHeavyApples=AppleApp.getAllApplesOnPredicate(apples, greenAndHeavyPridate);
//			greenAndHeavyApples.stream().forEach(a-> System.out.println(a));
	}
}
