package com.kh.inherit.part01_inheritTest.beforeInherit.model.vo;

import java.util.Date;

public class Television {
	private String brand;				//제조사
	private String productNumber;		//상품번호
	private String productCode;			//상품코드
	private String productName;			//상품명
	private int price;					//가격
	private Date manufacturingDate;		//제조일자
	private int inchType;				//몇인치인지
	public Television(){}

	public Television(String brand, String productNumber, String productCode, String productName, int price,
			Date manufacturingDate, int inchType) {
		
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.inchType = inchType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	public void printInformation(){
		System.out.println(brand + ", " + productNumber + ", " + productCode 
							+ ", " + productName + ", " + price + ", " 
							+ manufacturingDate + ", " + inchType);
	}
}
