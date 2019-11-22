package com.kh.inherit.part02_overrideTest.book.run;

import com.kh.inherit.part02_overrideTest.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("������ ����", "������", 100);
		Book b2 = new Book("Ī���� ���� ���߰��Ѵ�", "��", 300);
		
		System.out.println("b1 = " + b1.toString());
		System.out.println("b2 = " + b2.toString());
		
		//.toString()�� ��ü ȣ�� �� �ڵ����� �ڿ� JVM�� ���� �����ȴ�.
		//���� ��ü�� �� Ȯ���� ���� ���� �������̵� �ؼ� ����.
		System.out.println("b1 = " + b1/*.toString()*/);
		System.out.println("b2 = " + b2);
		
		
		System.out.println("b1�� b2�� ���� ��ü�ΰ�? : " + b1.equals(b2));
		
		//b1�� ���� �ּҸ� b3�̶�� ���۷����� ���� ����
		Book b3 = b1;
		
		System.out.println("b1�� b3�� ���� ��ü�ΰ�? : " + b1.equals(b3));
		
		Book b4 = new Book("������ ����", "������", 100);
		
		System.out.println("b1�� b4�� ���� ��ü�ΰ�? : " + b1.equals(b4));
		
		//���� ������ �ּҰ� �ٸ� ��ü�� ���� ��ü��� �ϸ�
		//�ּҰ����� ���� ��ü�� ���� ��ü��� �Ѵ�.
		System.out.println("b1�� �ؽ��ڵ� : " + b1.hashCode());
		System.out.println("b4�� �ؽ��ڵ� : " + b4.hashCode());
	}

}














