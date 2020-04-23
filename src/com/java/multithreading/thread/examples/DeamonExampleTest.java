package com.java.multithreading.thread.examples;

public class DeamonExampleTest {

	public static void main(String[] args) {
		
		
		DeamonExample thread = new DeamonExample();
		thread.setDaemon(true);
		thread.start();
		
//		System.out.println("Main thread is deamon"+Thread.currentThread().isDaemon());
		for (int i = 1; i <= 10; i++) {
			System.out.println("Am from main thread:" + i);
		}
	}

}
