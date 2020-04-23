package com.java.multithreading.thread.examples;

public class ThreadWithYieldMethodExample extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				Thread.yield();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread:" + i);
		}
	}
	
	


}
