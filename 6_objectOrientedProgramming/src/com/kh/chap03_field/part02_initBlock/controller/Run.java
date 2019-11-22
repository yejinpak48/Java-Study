package com.kh.chap03_field.part02_initBlock.controller;

import com.kh.chap03_field.part02_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		
		p.information();
		
		Product p2 = new Product("´ë·úÆù", 300000, "»þ¿ì¹Ì");
		
		p2.information();
	}

}












