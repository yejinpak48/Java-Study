package com.kh.inherit.silsub2.point.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle(){}
	
	public Circle(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw(){
		super.draw();
		System.out.println("���� ���� : " + ((int)((radius * radius * Math.PI) * 10)) / 10.0);
		System.out.println("���� �ѷ� : " + ((int)((radius * 2 * Math.PI) * 10)) / 10.0);
	}
}
