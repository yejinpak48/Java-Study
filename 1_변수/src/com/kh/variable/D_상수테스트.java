package com.kh.variable;

public class D_상수테스트 {
	public void testFinal() {
		//상수 테스트
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + age);
		
		age = 30;
		//AGE = 30;  //에러 발생 -> 상수값 변경 불가
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		System.out.println("Math.PI : " + Math.PI);
		
	}

	public static void main(String[] args) {
		/*D_상수테스트 test = new D_상수테스트();
		test.testFinal();*/
		new D_상수테스트().testFinal();

	}

}











