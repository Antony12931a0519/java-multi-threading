package com.java.multithreading.thread.examples;

public class ThreadDemoTest {
	
	public static void main(String[] args) {
		
		ThreadDemo demo = new ThreadDemo();
		demo.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread:"+i);
		}
	}

}
