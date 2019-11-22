package com.kh.inherit.part01_inheritTest.beforeInherit.model.vo;

import java.util.Date;

public class SmartPhone {
	private String brand;				//������
	private String productNumber;		//��ǰ��ȣ
	private String productCode;			//��ǰ�ڵ�
	private String productName;			//��ǰ��
	private String cpu;					//cpu
	private int hdd;					//hdd
	private int ram;					//ram
	private String operationSystem;		//�ü��
	private int price;					//����
	private Date manufacturingDate;		//��������
	private String mobileAgency;		//��Ż�
	public SmartPhone(){}

	public SmartPhone(String brand, String productNumber, String productCode, String productName, String cpu, int hdd,
			int ram, String operationSystem, int price, Date manufacturingDate, String mobileAgency) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.mobileAgency = mobileAgency;
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

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
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

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public void printInformation(){
		System.out.println(brand + ", " + productNumber + ", " + productCode 
							+ ", " + productName + ", " + cpu + ", " + hdd + ", " 
							+ ram + ", " + operationSystem + ", " + price + ", " 
							+ manufacturingDate + ", " + mobileAgency);
	}
}










