package com.java8.session1.ex3;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//OCP
public class AppleApp {
   //find all greens apples
	//OCP
	public static List<Apple> getApplesOnCondition(List<Apple> apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).toList();
	}

}

//public List<Apple> getAllGreenApples(List<Apple> apples){
//	List<Apple>apples2=new ArrayList<>();
//	for(Apple temp: apples) {
//		if(temp.isGreen()==true) {
//			apples2.add(temp);
//		}
//	}
//	return apples2;
//}
//public List<Apple> getAllHeavyApples(List<Apple> apples){
//	List<Apple>apples2=new ArrayList<>();
//	for(Apple temp: apples) {
//		if(temp.isHeavy()==true) {
//			apples2.add(temp);
//		}
//	}
//	return apples2;
//}



