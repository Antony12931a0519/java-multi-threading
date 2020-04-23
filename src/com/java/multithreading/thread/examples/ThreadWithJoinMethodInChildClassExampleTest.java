package com.java.multithreading.thread.examples;

public class ThreadWithJoinMethodInChildClassExampleTest {

	public static Thread mainThread;

	public static void main(String [] ar) throws InterruptedException {
		ThreadWithJoinMethodInChildClassExample ref = new ThreadWithJoinMethodInChildClassExample();
		ref.start();
		ref.mainThread = Thread.currentThread();
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("Am main Thread with thredname:" + i);
		}
	}

}
