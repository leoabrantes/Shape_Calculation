package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {
	
	final static double pi = 3.14159;

	private double r;
	
		
	public Circle() {
		
	}
	
		
	public Circle(Color color, double r) {
		super(color);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public Double area() {

		return this.r*this.r*pi;
	}

}
