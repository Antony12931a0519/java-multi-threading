package com.java.multithreading.without.synchronization.examples;

public class OnlineBookingThreadWithoutSynchronized extends Thread {

	ReservationSystemWithoutSynchronized reservationSystem;
	String passengerName;

	public OnlineBookingThreadWithoutSynchronized(ReservationSystemWithoutSynchronized reservationSystem, String passengerName) {
		this.reservationSystem = reservationSystem;
		this.passengerName = passengerName;
	}

	public void run() {

		reservationSystem.reserveTicket(passengerName);

	}

}
