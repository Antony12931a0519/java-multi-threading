package com.java.multithreading.thread.examples;

public class ThreadWithInterruptMethodExample extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Am Child Thread" + i);
		}
		System.out.println("I want to sleep for some time");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Some one disturbed me from sleeping");
		}
	}

}
