package com.cts.javasefundas.model;

public class ComplexNumber {
	
	private int real;
	private int img;
	
	public ComplexNumber() {
		// TODO Auto-generated constructor stub
	}

	public ComplexNumber(int real, int img) {
		super();
		this.real = real;
		this.img = img;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public String toString() {
		return real + (img>0?"+i"+img:"-i"+-img);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + img;
		result = prime * result + real;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplexNumber other = (ComplexNumber) obj;
		if (img != other.img)
			return false;
		if (real != other.real)
			return false;
		return true;
	}
	
	
}
