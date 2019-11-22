package com.kh.silsub2.product.controller;

import com.kh.silsub2.product.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.setpName("아이뽕");
		p1.setPrice(1000000);
		p1.setBrand("사과");
		Product.setTaxRate(0.1);
		
		p1.information();
		
		Product p2 = new Product();
		
		//p2.pName = "아이뽕";	//에러남, private는 해당 클래스 내부 접근 가능
		p2.price = 1000000;
		//p2.brand = "사과";		//에러남, default는 해당 패키지 내부에서만 접근 가능
		//Product.taxRate = 0.1; //에러남, static이어도 접근제한자는 적용됨
		
		p2.information();
	}

}














