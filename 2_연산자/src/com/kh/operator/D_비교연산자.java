package com.kh.operator;

public class D_�񱳿����� {
	public void opTest() {
		/*
		 * ���迬����(�񱳿�����)
		 * -> �� ���� ������ ���踦 ������ ������, �ٸ� ���� �� �����ڶ�� ��
		 * -> ���� �����ڴ� ������ �����ϸ� true, �������� ���ϸ� false�� ��ȯ
		 * 
		 * <    ex) a < b    a�� b���� ������?
		 * >    ex) a > b    a�� b���� ū��?
		 * ==   ex) a == b   a�� b�� ������?
		 * !=   ex) a != b   a�� b�� �ٸ���?
		 * <=   ex) a <= b   a�� b���� �۰ų� ������?
		 * >=   ex) a >= b   a�� b���� ũ�ų� ������? 
		 * 
		 * */
		
		/*int a = 10;
		int b = 20;*/
		int a = 10, b = 20;
		boolean result1, result2, result3;
		
		result1 = (a == b);
		result2 = (a <= b);
		result3 = (a > b);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

	public static void main(String[] args) {
		D_�񱳿����� test = new D_�񱳿�����();
		test.opTest();
	}

}















