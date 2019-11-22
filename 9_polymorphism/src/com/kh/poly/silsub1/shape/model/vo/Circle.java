package com.kh.poly.silsub1.shape.model.vo;

public class Circle /*extends Shape*/implements IShape{
	public static final double PI = Math.PI;
	private double radius;
	
	
	public Circle(){}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public static double getPi() {
		return PI;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = radius * radius * PI;
		
		return area;
	}

	@Override
	public double perimeter() {
		
		return (radius * 2) * PI;
	}
	
	
	
	
}
