package com.java.multithreading.thread.examples;

public class ThreadWithYieldMethodExample extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread:" + i);
		}
	}

	public static void main(String[] args) {
		ThreadWithYieldMethodExample ref = new ThreadWithYieldMethodExample();
		ref.start();
		for (int i = 0; i <= 10; i++) {
			Thread.yield();
			System.out.println("Main Thread:" + i);
		}

	}

}
