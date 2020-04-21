package com.java.multithreading.without.synchronization.examples;

public class ReservationSystemWithoutSynchronized {
	int availableTicketsCount ;

	
	public  void reserveTicket(String name) {

		
		if (availableTicketsCount != 0) {
			// count++;
			System.out.println("Ticket is reserved successfully for :" + name + " and the ticket Id:" + (availableTicketsCount - 1));
			availableTicketsCount--;
		} else {
			System.out.println("Tickets are not avilable.");
		}

	}}
