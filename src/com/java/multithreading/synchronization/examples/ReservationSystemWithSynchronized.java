package com.java.multithreading.synchronization.examples;

import java.util.Random;

public class ReservationSystemWithSynchronized {

	int availableTicketsCount;

	public  void reserveTicket(String name) {

		System.out.println("Welcome to the Online ticket booking system");
		synchronized(this) {
			System.out.println("Ticket is processing for the passenger:"+name);
			if (availableTicketsCount != 0) {
				// count++;
				System.out.println(
						"Ticket is reserved successfully for :" + name + " and the ticket Id:" + new Random().nextLong());
				availableTicketsCount--;
			} else {
				System.out.println("Tickets are not avilable for the passenger :"+name);
			}

		}
		
	}

}
