package com.kh.inherit.part01_inheritTest.afterInherit.model.vo;

import java.util.Date;

public class Desktop extends Computer{
	//데스크탑도 product를 상속받아 만들려고 하니 스마트폰과 겹치는 속성들이 존재한다.
	//데스크탑과 스마트폰의 공통적인 속성을 computer라는 클래스를 만들어 정의하였다.
	//새로 만드는 desktop클래스는 computer를 상속받아 구현한다.
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String productNumber,
				String productCode, String productName,
				int price, Date manufacturingDate,
				String cpu, int hdd, int ram,
				String operationSystem, boolean allInOne) {
		super(brand, productNumber, productCode, productName,
				price, manufacturingDate, cpu, hdd, ram,
				operationSystem);
		this.allInOne = allInOne;
		
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation() + ", " + this.allInOne;
	}
}





















