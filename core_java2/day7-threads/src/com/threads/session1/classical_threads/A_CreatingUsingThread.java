package com.threads.session1.classical_threads;

class Job implements Runnable{
   public void run() {
	   System.out.println("start:"+Thread.currentThread().getName());
	   System.out.println("the job of threads");
	   try {
		   Thread.sleep(1000);
	   }catch(InterruptedException e) {}
	   System.out.println("end:"+Thread.currentThread().getName());
	   
   }
}
public class A_CreatingUsingThread {
    public static void main(String[] args) throws InterruptedException {
    	
    	
    	Thread thread=new Thread(()-> System.out.println("job of the threads"));
    	thread.start();
    	
    	
    	
    	
    	
    	//Threads worker that want to do a job
    	System.out.println(Thread.currentThread().getName());
    	
    	
    	
    	
   
    	
        System.out.println("start");
        
        Job job=new Job();
        
        Thread thread1 = new Thread(job,"A");
        Thread thread2 = new Thread(job,"B");
        Thread thread3 = new Thread(job,"C");

        thread1.start();
        thread2.start();
        thread3.start();
//
        thread1.join(4000, 5000);;
        thread2.join();
        thread3.join();
//
       System.out.println("end");

    }
}
