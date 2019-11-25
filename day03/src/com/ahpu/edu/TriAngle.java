package com.ahpu.edu;

public class TriAngle {
	private double height;
	private double base;
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	public TriAngle() {
		
	}
	
	public TriAngle(double b,double h) {
		base = b;
		height  = h;
	}
	
	public double TriArea() {
		return (height*base)/2;
	}

}
