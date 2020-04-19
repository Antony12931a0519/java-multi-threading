package com.java.multithreading.thread.examples;

public class ThreadUsingRunnableExampleTest {

	public static void main(String[] args) {
		ThreadUsingRunnableExample ref = new ThreadUsingRunnableExample();
		// if we define thread by using the Thread class no need to pass the runnable as
		// input , why because by default thread implements Runnable. When ever you want
		// to use Runnable for defing the thread then, we need to explicitly pass the
		// runnable object as imput ot the thread.
		Thread t = new Thread(ref);
		t.start();

		System.out.println("Am from main thread");
	}

}
