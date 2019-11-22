package com.kh.chap03_field.part02_initBlock.model.vo;

public class Product {
	private String pName = "������";
	private int price = 1000000;
	private static String brand = "���";
	
	{
		pName = "���̾�";
		price = 900000;
		//�ν��Ͻ� �ʱ�ȭ �������� static �ʵ带 �ʱ�ȭ �� �� �ִ�.
		//������ static �ʱ�ȭ ���� ���α׷� ���� �ÿ� �ʱ�ȭ�� �ϱ� ������
		//��ü ���� ���� ���� �ʱ�ȭ�ϴ� �ν��Ͻ� �ʱ�ȭ ���� ������ ����� �ȴ�.
		brand = "���";
	}
	
	static {
		//static �ʱ�ȭ�������� non-static �ʵ带 �ʱ�ȭ���� ���Ѵ�.
		/*pName = "���̻�";
		price = 1000000;*/
		brand = "����";
	}
	
	//�⺻������
	public Product() {}
	
	//�Ű����� �ִ� ������
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		Product.brand = brand;
	}
	
	
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		Product.brand = brand;
	}
	
	//getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public static String getBrand() {
		return brand;
	}
	
	public void information() {
		System.out.println(pName + ", " + price + ", " + brand);
	}
	
}





















