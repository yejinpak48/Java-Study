package com.kh.chap03_field.part02_initBlock.model.vo;

public class Product {
	private String pName = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼송";
	
	{
		pName = "사이언";
		price = 900000;
		//인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 있다.
		//하지만 static 초기화 블럭은 프로그램 시작 시에 초기화를 하기 때문에
		//객체 생성 이후 값을 초기화하는 인스턴스 초기화 블럭의 값으로 덮어쓰게 된다.
		brand = "사과";
	}
	
	static {
		//static 초기화블럭에서는 non-static 필드를 초기화하지 못한다.
		/*pName = "아이뽕";
		price = 1000000;*/
		brand = "헬지";
	}
	
	//기본생성자
	public Product() {}
	
	//매개변수 있는 생성자
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





















