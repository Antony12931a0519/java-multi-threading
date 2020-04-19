package com.java.multithreading.thread.examples;

public class ThreadWithInterruptMethodExampleTest extends Thread {

	public static void main(String[] ar) {

		ThreadWithInterruptMethodExample ref = new ThreadWithInterruptMethodExample();
		ref.start();
		
		ref.interrupt();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Am main Thread" + i);
		}

	}

}
