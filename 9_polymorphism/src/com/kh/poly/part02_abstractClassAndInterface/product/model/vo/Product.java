package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

//�߻�޼ҵ带 ����� ���� ��쿡�� class �տ� �ݵ�� abstract Ű���带 ǥ���ؾ� �Ѵ�.
//�߻�Ŭ������ �̿ϼ��� Ŭ������ ���ϸ�, �̿ϼ� �޼ҵ�� �ݵ�� ����� �޾�
//�ļ��� �ϼ��� �ؾ� �Ѵ�.
//�߻� Ŭ������ ��ü�� �������� ���Ѵ�.
public abstract class Product {
	//�߻�Ŭ�������� �����ڸ� �ۼ��� �� �ִ�.
	public Product() {}
	
	//�߻�޼ҵ�(�̿ϼ� �޼ҵ�) : �޼ҵ� ��常 �ְ� �ٵ�� ���� �޼ҵ�
	//Hook Method
	public abstract void abstMethod();
	
	//�߻�Ŭ������ ��ü �ִ� �޼ҵ带 �ۼ��� �� �ִ�.
	public void printProduct() {
		System.out.println("Product Ŭ������ �޼ҵ� ����");
	}
	
	@Override
	public String toString() {
		return "Product�� toString() �޼ҵ� ����...";
	}
}

















