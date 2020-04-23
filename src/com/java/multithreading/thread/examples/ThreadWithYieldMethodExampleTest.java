package com.java.multithreading.thread.examples;

public class ThreadWithYieldMethodExampleTest extends Thread {

	public static void main(String[] args) {

		ThreadWithYieldMethodExample ref = new ThreadWithYieldMethodExample();
		ref.start();
		for (int i = 0; i <= 10; i++) {

			Thread.yield();
			System.out.println("Main Thread:" + i);
		}
	}

}
