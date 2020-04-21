package com.java.multithreading.interhtread.communucation.examples;

public class ChildThreadDemo extends Thread {
	int totalCount;

	public void run() {

		synchronized (this) {
			
			System.out.println("Child thread got the lock and ececute the code ");
			for (int i = 0; i <= 100; i++) {
				totalCount = totalCount + i;
			}
			System.out.println("Child thread executed the code");
			notify();
			System.out.println("Child thread sent the notification");
		}

	}

}
