package com.kh.chap05_method.part03_recursiveCallTest;

public class RecursiveCallTest {

	public static void main(String[] args) {
		RecursiveCallTest test = new RecursiveCallTest();
		int result = test.factorial(5);
		
		System.out.println(result);
	}
	//�޼ҵ� ������ ���� �޼ҵ带 �ٽ� ȣ���ϴ� ���� ���ȣ���̶�� �Ѵ�.
	public int factorial(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}

}













