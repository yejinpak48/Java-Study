package com.kh.first;

public class B_ValuePrinter {
	public void printValue1() {
		//여러 가지 형태의 값을 출력
		
		//숫자
		System.out.println(123);	//정수
		System.out.println(1.23);   //실수
		
		//문자
		System.out.println('A');
		System.out.println('a');
		
		//문자열
		System.out.println("안녕하세요");
		System.out.println("A");
		
		//값을 직접적으로 연산할 수도 있다.
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);
		
		//문자도 숫자로 인식하기 때문에 연산이 가능하다
		System.out.println('a' + 1);
		
		//문자열 + 숫자는 문자열의 결과를 가진다.
		System.out.println("안녕하세요" + 123);
	}
	public void printValue2() {
		//문자열과 숫자의 + 연산
		System.out.println(9 + 9);		//18
		System.out.println(9 + "9");	//99
		System.out.println("9" + 9);	//99
		System.out.println("9" + "9");	//99
		
		System.out.println(9 + 9 + "9");	//189
		System.out.println(9 + "9" + 9);	//999
		System.out.println("9" + 9 + 9);	//999
		System.out.println("9" + (9 + 9));	//918
	}
	
	public void printValue3() {
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		System.out.println((((100 + 10) * 10) - 10) / 10);
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		//보너스를 더한 포인트
		System.out.println(point + bonus);
		//보너스를 더한 포인트를 10명에게 준다면 필요한 포인트는?
		System.out.println((point + bonus) * personCount);
		//보너스를 더한 포인트를 10명에게 주고 수수료를 10포인트 차감한다면?
		System.out.println(((point + bonus) * personCount) - fees);
		//보너스를 10명에게 주고 수수료를 10포인트 차감한다면
		//10명이 받는 포인트는 각각 얼마인가?
		System.out.println((((point + bonus) * personCount) - fees) / personCount);
		
		//1. 변수는 값에 의미를 부여하기 위한 목적으로 사용된다.
		//2. 한번 값을 저장해 두고 계속 사용할 목적으로 사용된다.
		//3. 유지보수성을 증가시키기 위한 목적으로 사용된다.
	}
	

	public static void main(String[] args) {
		B_ValuePrinter vp = new B_ValuePrinter();
		//vp.printValue1();
		//vp.printValue2();
		vp.printValue3();
	}

}









