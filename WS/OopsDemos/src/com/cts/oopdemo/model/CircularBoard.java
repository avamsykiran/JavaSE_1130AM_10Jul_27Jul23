package com.cts.oopdemo.model;

public class CircularBoard implements AdBoard {
	private double radius;
	
	public CircularBoard(){
		
	}

	public CircularBoard(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2*Math.PI*radius;
	}

	public String toString() {
		return "CircularBoard [radius=" + radius + "]";
	}
	
	
}
