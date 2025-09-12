package com.java8.session1.ex0.why_java8;
import java.util.stream.LongStream;
//declartive data processing, SQL
class Prime {
    public static boolean isPrime(Long n) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                isPrimeNumber = false;
        }
        return isPrimeNumber;
    }
}
public class WhyJava8 {
    public static void main(String[] args) {
    	
    	System.out.println(Runtime.getRuntime().availableProcessors());
    	
    	//13559 ms
    	//1907 ms
        //1 to 1_000_00000
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "1000");
        //System.out.println(Runtime.getRuntime().availableProcessors());
        long start=System.currentTimeMillis();
       
        long nos=LongStream.range(1, 1_000_00)
        		.filter(Prime::isPrime)
        		.parallel()
        		.count();
        System.out.println(nos);
        long end=System.currentTimeMillis();
        System.out.println(end-start+" ms");


    }
}
