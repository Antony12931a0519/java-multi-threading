package com.java.multithreading.synchronization.examples;

public class OnlineBookingThreadWithSynchronized extends Thread {

	ReservationSystemWithSynchronized reservationSystem;
	String passengerName;

	public OnlineBookingThreadWithSynchronized(ReservationSystemWithSynchronized reservationSystem,
			String passengerName) {
		this.reservationSystem = reservationSystem;
		this.passengerName = passengerName;
	}

	public void run() {

		reservationSystem.reserveTicket(passengerName);

	}

}
