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
	//final Ű���尡 ���� �ʵ�� setter ������ ����
	/*public static void setPi(double pi) {
		Circle.PI = pi;
	}*/
	public static void setRadius(int radius) {
		Circle.radius = radius;
	}
	//���� ������ 1 ������Ű�� �޼ҵ�
	public void incrementField() {
		radius++;
	}
	//���� ������ ���ϴ� �޼ҵ�
	public void getAreaOfCircle() {
		double area = radius * radius * PI;
		
		System.out.println("���� ������ " + area + "�Դϴ�.");
	}
	//���� �ѷ��� ���ϴ� �޼ҵ�
	public void getSizeOfCircle() {
		double size = 2 * radius * PI;
		
		System.out.println("���� �ѷ��� " + size + "�Դϴ�.");
	}
}


















