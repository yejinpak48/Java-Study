package com.kh.silsub3.circle.controller;

import com.kh.silsub3.circle.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		//지름 1 증가
		c.incrementField();
		
		//다시 둘레와 면적 구하기
		c.getAreaOfCircle();
		c.getSizeOfCircle();

	}

}















