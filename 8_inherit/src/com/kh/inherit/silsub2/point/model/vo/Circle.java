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
		System.out.println("원의 면적 : " + ((int)((radius * radius * Math.PI) * 10)) / 10.0);
		System.out.println("원의 둘레 : " + ((int)((radius * 2 * Math.PI) * 10)) / 10.0);
	}
}
