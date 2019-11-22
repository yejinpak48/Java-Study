package com.kh.inherit.silsub2.point.main;

import com.kh.inherit.silsub2.point.model.vo.Circle;
import com.kh.inherit.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, 10, 1);
		Circle c2 = new Circle(20, 20, 50);
		Circle c3 = new Circle(30, 30, 100);
		
		c1.draw();
		c2.draw();
		c3.draw();
		
		Rectangle r1 = new Rectangle(10, 10, 10, 30);
		Rectangle r2 = new Rectangle(30, 20, 20, 40);
		Rectangle r3 = new Rectangle(5, 30, 50, 20);
		
		r1.draw();
		r2.draw();
		r3.draw();
	}

}
