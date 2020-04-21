package com.java.multithreading.thread.examples;

public class ThreadDemo1  implements Runnable{
	/*
	public void start() {
		System.out.println("cutom start method ");
	}*/
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread:"+i);
		}
	}
	/*
	public void start() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread:"+i);
		}
	}*/

	/*public void run(int i) {
		for( i=0;i<=10;i++) {
			System.out.println("Child Thread:"+i);
		}
	}*/

}
