package com.kh.operator;

public class C_산술연산자 {
	public void opTest() {
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		//값 % 배수 == 0  <= 어떠한 수의 배수인지를 물어볼 때 사용한다.
		//짝수냐? ==> 값 % 2 == 0 or 값 % 2 != 1
		//홀수냐? ==> 값 % 2 == 1 or 값 % 2 != 0
		
		//5의 배수냐? ==> 값 % 5 == 0
		
		
	}
	

	public static void main(String[] args) {
		new C_산술연산자().opTest();
		

	}

}








