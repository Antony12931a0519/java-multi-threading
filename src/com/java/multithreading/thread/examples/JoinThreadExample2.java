package com.java.multithreading.thread.examples;

public class JoinThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		
		JoinThreadExample1 ref = new JoinThreadExample1();
		ref.start();
		ref.mainThread= Thread.currentThread();
		ref.join();
		for (int i = 0; i <= 10; i++) {

			System.out.println("Hey am child thraed:"+i);
		}
	}

}
