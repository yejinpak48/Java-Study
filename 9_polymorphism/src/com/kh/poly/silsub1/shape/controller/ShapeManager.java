package com.kh.poly.silsub1.shape.controller;

import com.kh.poly.silsub1.shape.model.vo.Circle;
import com.kh.poly.silsub1.shape.model.vo.IShape;
import com.kh.poly.silsub1.shape.model.vo.Rectangle;
import com.kh.poly.silsub1.shape.model.vo.Shape;
import com.kh.poly.silsub1.shape.model.vo.Triangle;

public class ShapeManager {
	public void calcShape(){
		//Shape s;
		IShape s;
		
		
		s = new Circle(15.5);
		System.out.println("�� ���� : " + s.area());
		System.out.println("�� �ѷ� : " + s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		System.out.println("�簢�� ���� : " + s.area());
		System.out.println("�簢�� �ѷ� : " + s.perimeter());
	}
	
	public void calcShapeArray(){
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(13.2);
		iarr[1] = new Rectangle(11.3, 21.5);
		iarr[2] = new Triangle(12.3, 11.2);
		iarr[3] = new Circle(5.12);
		iarr[4] = new Triangle(22.1, 10.5);
		
		
		for(int i = 0; i < iarr.length; i++){
			System.out.println("������ ���� : " + iarr[i].area());
			System.out.println("������ �ѷ� : " + iarr[i].perimeter());
			
			if(iarr[i] instanceof Triangle){
				System.out.println("������ ���� : " + ((Triangle)(iarr[i])).getHypotenuse());
			}
		}
		
	}
	
	
}
