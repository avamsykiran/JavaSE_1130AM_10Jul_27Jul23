package com.cts.javasefundas;

import com.cts.javasefundas.model.ComplexNumber;

public class App02 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			double generated= Math.random();
			double randomNumber = Math.floor(generated*100);
			System.out.println(randomNumber);
		}
	}

}
