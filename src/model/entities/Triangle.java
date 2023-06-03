package model.entities;

import model.enums.Color;

public class Triangle extends AbstractShape {
	
	private double b;
	private double h;
		
	public Triangle() {
		
	}
	
	public Triangle(Color color, double b, double h) {
		super(color);
		this.b = b;
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	@Override
	public Double area() {

		return b*h/2;
	}

}
