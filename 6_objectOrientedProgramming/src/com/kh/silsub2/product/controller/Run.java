package com.kh.silsub2.product.controller;

import com.kh.silsub2.product.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.setpName("���̻�");
		p1.setPrice(1000000);
		p1.setBrand("���");
		Product.setTaxRate(0.1);
		
		p1.information();
		
		Product p2 = new Product();
		
		//p2.pName = "���̻�";	//������, private�� �ش� Ŭ���� ���� ���� ����
		p2.price = 1000000;
		//p2.brand = "���";		//������, default�� �ش� ��Ű�� ���ο����� ���� ����
		//Product.taxRate = 0.1; //������, static�̾ ���������ڴ� �����
		
		p2.information();
	}

}














