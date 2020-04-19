package com.java.multithreading.thread.examples;

public class ThreadWithJoinMethodInChildClassExample_DeadLockTest {

	public static void main(String[] args) throws InterruptedException {

		ThreadWithJoinMethodInChildClassExample_DeadLock ref = new ThreadWithJoinMethodInChildClassExample_DeadLock();
		
		ref.start();
		ref.mainThread = Thread.currentThread();
		ref.join();
		
		for (int i = 0; i <= 10; i++) {

			System.out.println("am in thread main");
		}
	}
}
