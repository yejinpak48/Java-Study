package com.kh.first;

public class A_MethodPrinter { //Ŭ���� �����
	
	public void methodA() {
		System.out.println("methodA() ȣ���...");
		methodB();
	}
	public void methodB() {
		System.out.println("methodB() ȣ���...");
		methodC();
	}
	public void methodC() {
		System.out.println("methodC() ȣ���...");
	}
	public static void main(String[] args) {
		//�ڹٿ����� Ŭ������ ���� �޼ҵ带 �����Ϸ���
		//�Ʒ��� ���� ����ؾ� �Ѵ�.
		//Ŭ������ ������̸� = new Ŭ������();
		//������̸�.�޼ҵ��();
		A_MethodPrinter p = new A_MethodPrinter();
		p.methodA();
		/*p.methodB();
		p.methodC();*/
	}

}




