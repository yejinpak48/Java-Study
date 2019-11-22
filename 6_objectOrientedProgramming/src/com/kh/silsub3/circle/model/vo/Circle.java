package com.kh.silsub3.circle.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {}
	
	public static double getPi() {
		return PI;
	}
	public static int getRadius() {
		return radius;
	}
	//final 키워드가 붙은 필드는 setter 만들지 못함
	/*public static void setPi(double pi) {
		Circle.PI = pi;
	}*/
	public static void setRadius(int radius) {
		Circle.radius = radius;
	}
	//원의 지름을 1 증가시키는 메소드
	public void incrementField() {
		radius++;
	}
	//원의 면적을 구하는 메소드
	public void getAreaOfCircle() {
		double area = radius * radius * PI;
		
		System.out.println("원의 면적은 " + area + "입니다.");
	}
	//원의 둘레를 구하는 메소드
	public void getSizeOfCircle() {
		double size = 2 * radius * PI;
		
		System.out.println("원의 둘레는 " + size + "입니다.");
	}
}


















