package com.java.multithreading.thread.examples;

public class ThreadDemoTest1 {
	
	public static void main(String[] args) {
		
		ThreadDemo1 demo = new ThreadDemo1();
		
		Thread thred = new Thread(demo);
		
		thred.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread:"+i);
		}
		thred.start();
	}

}
