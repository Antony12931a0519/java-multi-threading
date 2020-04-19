package com.java.multithreading.thread.examples;

public class ThreadWithJoinMethodInChildClassExample_DeadLock extends Thread {

	public static Thread mainThread;

	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Am child Thread with thredname:" + i);
		}
	}

}
