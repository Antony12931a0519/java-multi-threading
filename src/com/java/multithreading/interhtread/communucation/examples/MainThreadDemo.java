package com.java.multithreading.interhtread.communucation.examples;

public class MainThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		ChildThreadDemo child = new ChildThreadDemo();
		child.start();
		
        synchronized (child) {
        	System.out.println("Main thread is going to  waiting state now");

        	child.wait();
                	
        	System.out.println("Parent got the notification.");
        	
        	System.out.println("THe total count is :" + child.totalCount);
		}
		

	}

}
