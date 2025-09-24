package com.productapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoLogging {
	private static Logger logger=LoggerFactory.getLogger(DemoLogging.class);
	
	public static void main(String[] args) {
		//how to configure the logging in java application?
		logger.info("this is a lgging message");
		try {
			Integer val=Integer.parseInt("123s");
		}catch(Exception e) {
			logger.error("something goes wrong "+ e);
		}
		
	}

}
