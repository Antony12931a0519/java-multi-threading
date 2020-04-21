package com.java.multithreading.block_synchronization.examples;

public class BookingAppWithSynchronized {
	public static void main(String[] args) {

		ReservationSystemWithSynchronized reservationSystem = new ReservationSystemWithSynchronized();
		
		reservationSystem.availableTicketsCount=2;

		OnlineBookingThreadWithSynchronized passenger1 = new OnlineBookingThreadWithSynchronized(reservationSystem,
				"Antony");
		OnlineBookingThreadWithSynchronized passenger2 = new OnlineBookingThreadWithSynchronized(reservationSystem,
				"Sampath");
		OnlineBookingThreadWithSynchronized passenger3 = new OnlineBookingThreadWithSynchronized(reservationSystem,
				"Kumar");
		OnlineBookingThreadWithSynchronized passenger4 = new OnlineBookingThreadWithSynchronized(reservationSystem,
				"Reddy");
		passenger1.start();
		passenger2.start();
		passenger3.start();
		passenger4.start();

	}

}
