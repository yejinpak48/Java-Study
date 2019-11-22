package com.kh.operator;

import java.util.Scanner;

public class A_논리부정연산자 {
	// !논리값 : 논리값을 반대로 바꾸는 연산자
	// !true => false, !false => true가 된다.
	public static void testMethod() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수인가? " + !(!(num % 2 == 0)));
		System.out.println("입력한 정수가 짝수인가? " + !(num % 2 != 0));
		
		//위에서 입력 받은 수가 3의 배수인지 확인하여 출력하세요
		System.out.println("입력한 정수가 3의 배수인가? " + (num % 3 == 0));
		System.out.println("입력한 정수가 3의 배수인가? " + !(num % 3 != 0));
		
		System.out.println("입력한 정수가 양수인가? " + (num > 0));
		System.out.println("입력한 정수가 양수인가? " + !(num <= 0));
	}
	

	public static void main(String[] args) {
		//static 메소드를 호출할 때는 new를 사용하지 않는다.
		//클래스명.메소드명()으로 호출한다.
		
		A_논리부정연산자.testMethod();

	}

}















