package com.java.multithreading.block_synchronization.examples;

import java.util.Random;

public class ReservationSystemWithSynchronized {

	int availableTicketsCount;

	public synchronized void reserveTicket(String name) {

		if (availableTicketsCount != 0) {
			// count++;
			System.out.println(
					"Ticket is reserved successfully for :" + name + " and the ticket Id:" + new Random().nextLong());
			availableTicketsCount--;
		} else {
			System.out.println("Tickets are not avilable.");
		}

	}

}
