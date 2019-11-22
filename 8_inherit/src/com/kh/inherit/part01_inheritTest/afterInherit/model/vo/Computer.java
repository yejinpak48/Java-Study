package com.kh.inherit.part01_inheritTest.afterInherit.model.vo;

import java.util.Date;

public class Computer extends Product{
	//product 클래스를 상속받아 데스크탑과 스마트폰의 공통 속성 정의
	private String cpu;
	private int hdd;
	private int ram;
	private String operationSystem;
	
	public Computer() {}
	
	public Computer(String brand, String productNumber,
					String productCode, String productName,
					int price, Date manufacturingDate,
					String cpu, int hdd, int ram, 
					String operationSystem) {
		super(brand, productNumber, productCode, productName,
				price, manufacturingDate);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}

	public String getCpu() {
		return cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public int getRam() {
		return ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation() + ", "
				+ this.cpu + ", " + this.hdd + ", " +
				this.ram + ", " + this.operationSystem;
	}
	
}















