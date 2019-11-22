package com.kh.inherit.part01_inheritTest.afterInherit.model.vo;

import java.util.Date;

public class Product {
	private String brand;
	private String productNumber;
	private String productCode;
	private String productName;
	private int price;
	private Date manufacturingDate;
	
	public Product() {}

	public Product(String brand, String productNumber, String productCode, String productName, int price,
			Date manufacturingDate) {
		super();
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		
		System.out.println("부모생성자 호출 완료...");
	}

	public String getBrand() {
		return brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public String printInformation() {
		return brand + ", " + productNumber + ", " 
				+ productCode + ", " + productName + ", "
				+ price + ", " + manufacturingDate; 
	}
}













