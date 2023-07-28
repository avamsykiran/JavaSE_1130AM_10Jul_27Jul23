package com.cts.threadsdemo;

import com.cts.threadsdemo.model.Bus;
import com.cts.threadsdemo.service.ReservationService;

public class App3 {

	public static void main(String[] args) {

		Bus bus = new Bus(25);
		
		ReservationService rs1 = new ReservationService(bus, 10);
		ReservationService rs2 = new ReservationService(bus, 10);
		ReservationService rs3 = new ReservationService(bus, 10);
		
		Thread t1 = new Thread(rs1, "R1");
		Thread t2 = new Thread(rs2, "R2");
		Thread t3 = new Thread(rs3, "R3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Reservation Process Started...!");
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(t1.getName() + ">> "+rs1.getSeatsReserved());
		System.out.println(t2.getName() + ">> "+rs2.getSeatsReserved());
		System.out.println(t3.getName() + ">> "+rs3.getSeatsReserved());
	}

}
