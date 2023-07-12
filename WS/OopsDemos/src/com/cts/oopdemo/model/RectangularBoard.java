package com.cts.oopdemo.model;

public class RectangularBoard implements AdBoard {

	private int length;
	private int breadth;
	
	public RectangularBoard(){
		
	}

	public RectangularBoard(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double area() {
		return length*breadth;
	}

	public double perimeter() {
		return 2*(length+breadth);
	}

	public String toString() {
		return "RectangularBoard [length=" + length + ", breadth=" + breadth
				+ "]";
	}
	
	
}
