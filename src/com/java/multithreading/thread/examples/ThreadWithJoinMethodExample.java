package com.java.multithreading.thread.examples;

public class ThreadWithJoinMethodExample extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread:" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadWithJoinMethodExample ref = new ThreadWithJoinMethodExample();
		ref.start();
		for (int i = 0; i <= 10; i++) {
			ref.join();
			System.out.println("Main Thread:" + i);
		}

	}

}
