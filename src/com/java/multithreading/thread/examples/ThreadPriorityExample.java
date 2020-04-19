package com.java.multithreading.thread.examples;

public class ThreadPriorityExample extends Thread {
	// thread has priorites from 1 to 10 --max priprity will be given to 10 and min
	// priority will be given to 1. For setting the thread priprities we have three
	// default constants. ie Min_priority,Max_priority,Norm_priority.
	// min is 1 max is 10 and norm is 5
	// always priority of thread will totally depend on the parent priprity. Child
	// inherits the priprity of the parent.
	// we can update the priprity of the threads by using the setPriority method.
	// some operating systems does not support thread priprities
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setPriority(11);
	}

}
