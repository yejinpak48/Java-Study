package com.kh.chap05_method.part02_methodTest;

public class NonStaticMethodTest {
	//�Ű����� ������ ��ȯ�� ������ ���� ����
	//1. �Ű������� ���� ��ȯ���� ���� �޼ҵ�
	public void method1() {
		//�ƹ� ���� ��ȯ���� �ʰ� �޼ҵ� ���븸 ������ �� ���ϰ� ���� ȣ���� �޼ҵ�� ���ư���.
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ� �Դϴ�.");
		return;		//��� �޼ҵ忡 �����Ǿ� ����(JVM�� �ڵ� ����)
	}
	
	//2. �Ű������� ���� ��ȯ�� �ִ� �޼ҵ�
	public String method2() {
		return "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ��Դϴ�.";
	}
	//3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		//ȣ���ϴ� ���� ��ȣ�� ���ڷ� �ѱ� ���� �ޱ� ���� �����ϴ� ���� �Ű������̸�
		//�޼ҵ� ���� �� ��ȣ �ȿ� ������ �����Ͽ� �޼ҵ� ������ ����Ѵ�.
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
		
		return;
	}
	//4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
}

















