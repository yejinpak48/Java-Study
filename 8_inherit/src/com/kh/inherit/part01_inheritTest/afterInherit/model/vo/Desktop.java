package com.kh.inherit.part01_inheritTest.afterInherit.model.vo;

import java.util.Date;

public class Desktop extends Computer{
	//����ũž�� product�� ��ӹ޾� ������� �ϴ� ����Ʈ���� ��ġ�� �Ӽ����� �����Ѵ�.
	//����ũž�� ����Ʈ���� �������� �Ӽ��� computer��� Ŭ������ ����� �����Ͽ���.
	//���� ����� desktopŬ������ computer�� ��ӹ޾� �����Ѵ�.
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





















