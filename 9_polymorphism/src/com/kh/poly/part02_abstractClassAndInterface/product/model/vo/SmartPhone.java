package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

//�߻�Ŭ������ ��ӹ��� �� extends Ű���带 ����Ѵ�.
public class SmartPhone extends Product{
	
	//��ӹ��� �θ��� �߻�޼ҵ�� �ݵ�� �������̵� �ؾ� �Ѵ�.
	@Override
	public void abstMethod() {}
	
	public void printSmartPhone() {
		System.out.println("SmartPhoneŬ������ printSmartPhone() �޼ҵ� ����...");
	}
	
	@Override
	public String toString() {
		return "SmartPhoneŬ������ toString()�޼ҵ� ����...";
	}

}















