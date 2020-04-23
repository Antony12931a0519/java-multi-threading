package com.java.multithreading.thread.examples;

public class DeamonExample extends Thread {

	public void run() {
		// System.out.println("Child thread is deamon" +
		// Thread.currentThread().isDaemon());
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Am from child thread:" + i);
		}
	}

}
