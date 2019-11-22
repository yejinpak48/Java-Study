package com.kh.inherit.silsub2.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle(){}
	
	public Rectangle(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw(){
		super.draw();
		System.out.println("사각형의 면적 : " + ((int)((width * height) * 10)) / 10.0);
		System.out.println("사각형의 둘레 : " + ((int)((width * 2 + height * 2) * 10)) / 10.0);
	}
}
