package com.kh.chap05_method.part02_methodTest;

public class StaticMethodTest {
	//static �޼ҵ�� ����(static)�޸� ������ ���α׷� ���� �� ����ȴ�.
	//���� ���α׷� ���� �� ���� �޸� �������� �����ȴ�.
	public static void staticMethod1() {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("10�� 20�� ���� " + (num1 + num2) + "�Դϴ�.");
	}
	
	public static int staticMethod2() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}
	
	public static void staticMethod3(String name) {
		System.out.println(name + "���� �湮�� ȯ���մϴ�.");
	}
	
	public static String staticMethod4(String name) {
		return name + "���� �湮�� ȯ���մϴ�.";
	}
	
	
}













