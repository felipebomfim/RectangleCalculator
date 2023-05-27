package com.chatgpt.rectangleCalculator;

public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	private double area;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		setPerimeter(this.length, this.width);
		setArea(this.length, this.width);
	}

	public double getPerimeter() {
		return perimeter;
	}

	private void setPerimeter(double length, double width) {
		this.perimeter = 2*(length+width);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double length, double width) {
		this.area = width*length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return this.length;
	}
}
