package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

import java.io.Serializable;
import java.util.Comparator;

//�߻�޼ҵ常 ����� ���� �� �ִ� �߻�Ŭ������ �������̽���� �Ѵ�.
//��� �ʵ常 ����� �߰��� �� �ִ�.

//�������̽��� ����� extends�� ����ϸ� ���� ����� �����Ѵ�.
//Ŭ�������� �������̽� ��� �� implements Ű���带 ���������
//�������̽��� ����� implements ����� �Ұ����ϴ�.
public interface IProduct extends Serializable/*, Comparator*/
		/*implements Iterator*/{
	//��� �ʵ�� �ݵ�� ����� ���ÿ� �ʱ�ȭ�� �Ǿ� �־�� �Ѵ�.
	//��� �ʵ�� ���������� public static final�̴�.
	/*public static final */String PRODUCT_NAME = "��ǰ��";
	
	//�������̽� �ȿ� ����� �޼ҵ�� ��� �߻�޼ҵ��̱� ������
	//����� public abstract�� ������ �� �ִ�.
	//���� �ļ��� �������̵��� �ݵ�� public���� �ؾ� �Ѵ�.
	/*public abstract void abstIMethod();*/
	void abstIMethod();
	
	//�������̽� �������� ��ü �ִ� �޼ҵ� �ۼ��� �Ұ����ϴ�.
	/*void method() {}*/

}
















