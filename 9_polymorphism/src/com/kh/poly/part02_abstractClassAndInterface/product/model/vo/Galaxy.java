package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

public class Galaxy extends SmartPhone{
	
	//����Ʈ�� Ŭ�������� Product�� �߻�޼ҵ带 ������ �� ���ұ� ������
	//SmartPhoneŬ������ ��ӹ޾� ����ϴ� ��쿡��
	//�ݵ�� �������̵� �ؾ� �ϴ� �δ��� ��������.
	//������ ����Ʈ�� Ŭ�������� �ƹ��� ��� ���� �޼ҵ� �ٵ� �ۼ��� �����̱� ������
	//����� �ʿ��� ��� ���������� �������̵��Ͽ� �޼ҵ带 ���ۼ� �ؾ� �Ѵ�.
	
	public void printGalaxy() {
		System.out.println("������ Ŭ������ printGalaxy() �޼ҵ� ����...");
	}
	
	@Override
	public String toString() {
		return "Galaxy Ŭ������ toString() �޼ҵ� ����...";
	}
}















