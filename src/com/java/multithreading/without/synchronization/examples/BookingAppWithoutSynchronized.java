package com.java.multithreading.without.synchronization.examples;

public class BookingAppWithoutSynchronized {
	public static void main(String[] args) {

		ReservationSystemWithoutSynchronized reservationSystem = new ReservationSystemWithoutSynchronized();
		reservationSystem.availableTicketsCount=2;
		OnlineBookingThreadWithoutSynchronized passenger1 = new OnlineBookingThreadWithoutSynchronized(reservationSystem, "Antony");
		OnlineBookingThreadWithoutSynchronized passenger2 = new OnlineBookingThreadWithoutSynchronized(reservationSystem, "Sampath");
		OnlineBookingThreadWithoutSynchronized passenger3 = new OnlineBookingThreadWithoutSynchronized(reservationSystem, "Kumar");
		OnlineBookingThreadWithoutSynchronized passenger4 = new OnlineBookingThreadWithoutSynchronized(reservationSystem, "Reddy");
		passenger1.start();
		passenger2.start();
		passenger3.start();
		passenger4.start();

	}

}
