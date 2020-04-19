package com.java.multithreading.thread.examples;

public class ThreadConstructorExample extends Thread {

	public static void main(String[] args) {
		ThreadConstructorExample t = new ThreadConstructorExample();

		ThreadUsingRunnableExample runnable = new ThreadUsingRunnableExample();

		Thread thread = new Thread();

		Thread t1 = new Thread(runnable);
		
		Thread t8 = new Thread("thread-t8");

		Thread t2 = new Thread(runnable, "thread-t2");

		Thread t7 = new Thread(Thread.currentThread().getThreadGroup(), runnable);

		Thread t6 = new Thread(Thread.currentThread().getThreadGroup(), "thread-t2");

		Thread t3 = new Thread(Thread.currentThread().getThreadGroup(), runnable, "thread-t2");

		Thread t5 = new Thread(Thread.currentThread().getThreadGroup(), runnable, "thread-t2", 20);

	}

}
