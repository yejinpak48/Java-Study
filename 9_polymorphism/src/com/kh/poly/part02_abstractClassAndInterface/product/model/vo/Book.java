package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

import java.io.Serializable;

//�������̽� ����� ��� implements Ű���带 ����Ѵ�.
//extends Ű����� ���� ��Ӹ� ����������,
//implements Ű����� ���� ��ӵ� �����Ѵ�.
public class Book extends Product/*, Date*/ 
			implements IProduct, Serializable{
	public Book() {}
	
	public void printBook() {
		System.out.println("Book Ŭ������ printBook() ����...");
	}

	@Override
	public void abstMethod() {}

	//�������̽��� �߻�޼ҵ� �������̵� �� �ݵ�� public���� ���������ڸ� �����ؾ� �Ѵ�.
	@Override
	public void abstIMethod() {}
	
	@Override
	public String toString() {
		return "Book Ŭ������ toString() �޼ҵ� ����...";
	}
}












