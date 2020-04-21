package com.java.multithreading.thread.examples;

public class ThreadDemoTest {
	
	public static void main(String[] args) {
		
		ThreadDemo demo = new ThreadDemo();
		
		
		
		//1 t0 10
		//5
		//Thread
		Thread.currentThread().setPriority(0);
		
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());
		
			
		
		
		demo.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread:"+i);
		}
	}

}
