package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
//		Magician magician=new MagicianProxy();
//		magician.doMagic();
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Magician magician=(Magician) ctx.getBean("magician");
		System.out.println(magician.getClass());
		magician.doMagic();
		
		Magician magician2=new Magician();
		System.out.println(magician2.getClass());
	}
}
