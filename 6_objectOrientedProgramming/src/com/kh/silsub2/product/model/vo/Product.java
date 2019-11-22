package com.kh.silsub2.product.model.vo;

public class Product {
	private String pName;
	public int price;
	String brand;
	protected static double taxRate;
	
	public Product() {}
	
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public static void setTaxRate(double taxRate) {
		Product.taxRate = taxRate;
	}
	//getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public static double getTaxRate() {
		return /*Product.*/taxRate;
	}
	public void information() {
		System.out.println(pName + ", " + price + ", " + brand + ", " + taxRate);
	}
}






















