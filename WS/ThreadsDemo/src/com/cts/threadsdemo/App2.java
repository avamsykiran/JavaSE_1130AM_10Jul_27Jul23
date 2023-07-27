package com.cts.threadsdemo;

import com.cts.threadsdemo.service.NumberSeriesGenerator;

public class App2 {

	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();
		
		NumberSeriesGenerator ns1 = new NumberSeriesGenerator(1, 10);
		NumberSeriesGenerator ns2 = new NumberSeriesGenerator(100, 110);
		NumberSeriesGenerator ns3 = new NumberSeriesGenerator(200, 210);
		/*
		ns1.run();
		ns2.run();
		ns3.run();
		*/
		
		Thread t1 = new Thread(ns1, "threadOne");
		Thread t2 = new Thread(ns2, "threadTwo");
		Thread t3 = new Thread(ns3, "threadThree");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(threadName + ">> This is the end of te porgram");
	}

}
