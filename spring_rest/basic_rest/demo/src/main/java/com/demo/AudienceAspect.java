package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
//Aspect=advice + pointcut
@Service
@Aspect
public class AudienceAspect {
	///@After, vs @AfterReturning @Before, @AroundAdvice
	
	@Around("execution( * com.demo..*.*(..))")
	public void clapping(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long start=System.currentTimeMillis();
		 proceedingJoinPoint.proceed();
		long end=System.currentTimeMillis();
		System.out.println("how much time taken:  "+ end);
	}
	
	
//	@AfterThrowing(pointcut = "execution(public void doMagic())", throwing = "ex")
//	public void clapping(FallFaintException ex) {
//		System.out.println("Call the dr its really req: "+ ex.getMessage());
//	}
}
