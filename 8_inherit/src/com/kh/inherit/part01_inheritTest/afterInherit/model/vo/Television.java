package com.kh.inherit.part01_inheritTest.afterInherit.model.vo;

import java.util.Date;

public class Television extends Product{
	//product Ŭ������ ��ӹ޾� �����ϸ�,
	//product Ŭ������ �ʵ�� �޼ҵ带 �ڽ��� ��ó�� ����� �� �ֱ� ������
	//televisionŬ������ ���������� product Ŭ������ �ۼ����� ����
	//�ʵ常 �ۼ��Ѵ�.
	private int inchType;
	
	public Television() {
		//��� �����ڿ��� super()�� �����Ǿ� �ִ�.
		//������ ȣ�� �� �θ� �������� ȣ����� �ȴ�.
		super();
	}
	//��� �ʵ带 �Ű������� �����ϴ� �������� ���
	//�θ��� �ʵ� �ʱ�ȭ�� ����� ���� �Ű������� �Բ� �޴´�.
	public Television(String brand, String productNumber,
					String productCode, String productName,
					int price, Date manufacturingDate,
					int inchType) {
		//�θ� �����ڸ� ȣ���ϴ� super() �����ڸ� ���� ���� �����Ѵ�.
		super(brand, productNumber, productCode, productName,
				price, manufacturingDate);
		//�θ� �����ڿ��� �ʿ����� ���� ���� �ڽ� Ŭ������ �ʵ带 �ʱ�ȭ�Ѵ�.
		this.inchType = inchType;
		
		System.out.println("product�� ��ӹ��� televisionŬ������ ������ ȣ�� �Ϸ�...");
	}
	public int getInchType() {
		return inchType;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	@Override
	public String printInformation() {
		//�θ��� �ʵ尡 private�� ��� �ٷ� �������� ���Ѵ�.
		/* return super.brand*/;
		/*return super.getBrand() + ", " +
				super.getProductNumber() + ", " + 
				super.getProductCode() + ", " +
				getProductName() + ", " + 
				getPrice() + ", " + 
				getManufacturingDate() + ", " + 
				this.inchType;*/
		return super.printInformation() + ", " + this.inchType;
	}
	
	
}












