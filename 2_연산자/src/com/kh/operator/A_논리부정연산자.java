package com.kh.operator;

import java.util.Scanner;

public class A_������������ {
	// !���� : ������ �ݴ�� �ٲٴ� ������
	// !true => false, !false => true�� �ȴ�.
	public static void testMethod() {
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ���� : " + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է��� ������ ¦���ΰ�? " + !(!(num % 2 == 0)));
		System.out.println("�Է��� ������ ¦���ΰ�? " + !(num % 2 != 0));
		
		//������ �Է� ���� ���� 3�� ������� Ȯ���Ͽ� ����ϼ���
		System.out.println("�Է��� ������ 3�� ����ΰ�? " + (num % 3 == 0));
		System.out.println("�Է��� ������ 3�� ����ΰ�? " + !(num % 3 != 0));
		
		System.out.println("�Է��� ������ ����ΰ�? " + (num > 0));
		System.out.println("�Է��� ������ ����ΰ�? " + !(num <= 0));
	}
	

	public static void main(String[] args) {
		//static �޼ҵ带 ȣ���� ���� new�� ������� �ʴ´�.
		//Ŭ������.�޼ҵ��()���� ȣ���Ѵ�.
		
		A_������������.testMethod();

	}

}















