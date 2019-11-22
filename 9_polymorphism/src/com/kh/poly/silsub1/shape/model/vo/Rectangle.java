package com.kh.poly.silsub1.shape.model.vo;

public class Rectangle/* extends Shape */implements IShape{
	private double width;
	private double height;
	
	public Rectangle(){}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		double area = width * height;
		
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = 2 * (width + height);
		
		return perimeter;
	}
	
	
}
