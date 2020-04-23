package com.java.multithreading.thread.examples;

public class JoinThreadExample1 extends Thread {

	public Thread mainThread;

	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <= 10; i++) {

			System.out.println("Hey am child thraed:" + i);
		}

	}

}
