package com.java.multithreading.thread.examples;

/**
 * @author anthony_sampath
 *
 */
// when ever we define thread by implementing runnable interface we will have
// chance to extend one more class by making use of inheritance concept.
public class ThreadUsingRunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Am from child thread");
	}

}
