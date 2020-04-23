package com.java.multithreading.thread.examples;

public class ThreadWithJoinMethodExampleTest  {


	public static void main(String[] args) throws InterruptedException {
		ThreadWithJoinMethodExample ref = new ThreadWithJoinMethodExample();
		ref.start();
		for (int i = 0; i <= 10; i++) {
//			ref.join();
			System.out.println("Main Thread:" + i);
		}

	}

}
