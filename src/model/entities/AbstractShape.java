package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
	
	public AbstractShape() {
		
	}
	
	public AbstractShape(Color color) {
		this.color = color;
	}

	private Color color;
		
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Shape [Color = " + color + ", Area = " + String.format("%.2f", area()) + "]";
	}
	
	
}
