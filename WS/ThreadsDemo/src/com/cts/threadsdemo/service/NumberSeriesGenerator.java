package com.cts.threadsdemo.service;

public class NumberSeriesGenerator implements Runnable {

	private int lowerBound;
	private int upperBound;
	
	public NumberSeriesGenerator(int lowerBound, int upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=lowerBound;i<=upperBound;i++) {
			System.out.println(name + ">> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
