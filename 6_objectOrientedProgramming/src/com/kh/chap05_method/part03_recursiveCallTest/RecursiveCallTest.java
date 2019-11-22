package com.kh.chap05_method.part03_recursiveCallTest;

public class RecursiveCallTest {

	public static void main(String[] args) {
		RecursiveCallTest test = new RecursiveCallTest();
		int result = test.factorial(5);
		
		System.out.println(result);
	}
	//메소드 내에서 본인 메소드를 다시 호출하는 것을 재귀호출이라고 한다.
	public int factorial(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}

}













