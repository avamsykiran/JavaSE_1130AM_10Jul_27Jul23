package com.cts.threadsdemo.model;

public class Bus {
	
	private int seats;
	private int lastAllotedSeat;
	
	public Bus(int seats) {
		super();
		this.seats = seats;
		this.lastAllotedSeat=0;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getLastAllotedSeat() {
		return lastAllotedSeat;
	}

	public void setLastAllotedSeat(int lastAllotedSeat) {
		this.lastAllotedSeat = lastAllotedSeat;
	}
	
	
	
}
