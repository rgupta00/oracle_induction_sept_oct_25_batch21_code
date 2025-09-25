package com.productapp.service.aspect;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.productapp.repo.Product;
import com.productapp.service.ProductServiceImpl;

@Aspect
@Service
public class LoggingAspect {
	private Logger logger=LoggerFactory.getLogger(ProductServiceImpl.class);
	
//	@Around("execution(* com.productapp.service..*.*(..))")
	@Around("@annotation(com.productapp.service.aspect.MyLogging)")
	public Object calPerformace(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object result= proceedingJoinPoint.proceed();
		long end= System.currentTimeMillis();
		String methodName=proceedingJoinPoint.getSignature().getName();
		logger.info("time taken to execute "+methodName+" method "+ (end-start)+" ms");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		return result;
	}
	

}
