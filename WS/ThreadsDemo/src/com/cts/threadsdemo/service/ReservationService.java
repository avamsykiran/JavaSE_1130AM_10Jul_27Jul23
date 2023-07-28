package com.cts.threadsdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.threadsdemo.model.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private int seatsNeeded;
	private List<String> seatsReserved;

	public ReservationService(Bus bus, int seatsNeeded) {
		super();
		this.bus = bus;
		this.seatsNeeded = seatsNeeded;
		this.seatsReserved = new ArrayList<>();
	}

	private boolean isSeatAvailable() {
		return bus.getLastAllotedSeat() != bus.getSeats();
	}

	@Override
	public void run() {
		synchronized (bus) {
			while (seatsNeeded != seatsReserved.size() && isSeatAvailable()) {
				int currenSeatNumber = bus.getLastAllotedSeat() + 1;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				seatsReserved.add("Seat#" + currenSeatNumber);
				bus.setLastAllotedSeat(currenSeatNumber);
			}
		}
	}

	public List<String> getSeatsReserved() {
		return seatsReserved;
	}

}
