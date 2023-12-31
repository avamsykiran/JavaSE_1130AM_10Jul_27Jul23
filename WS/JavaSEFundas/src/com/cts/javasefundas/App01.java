package com.cts.javasefundas;

import com.cts.javasefundas.model.ComplexNumber;

public class App01 {

	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber(10, -6);
		System.out.println(cn1);
		System.out.println(cn1.hashCode());
		ComplexNumber cn2 = new ComplexNumber(10, 6);
		System.out.println(cn2);
		System.out.println(cn2.hashCode());
		ComplexNumber cn3 = cn1;
		System.out.println(cn3);
		System.out.println(cn3.hashCode());
		ComplexNumber cn4 = new ComplexNumber(10, -6);
		System.out.println(cn4);
		System.out.println(cn4.hashCode());
		
		System.out.println(cn1.equals(cn2));
		System.out.println(cn1.equals(cn3));
		System.out.println(cn1.equals(cn4));
	}

}
