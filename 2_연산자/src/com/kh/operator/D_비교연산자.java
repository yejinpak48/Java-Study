package com.kh.operator;

public class D_비교연산자 {
	public void opTest() {
		/*
		 * 관계연산자(비교연산자)
		 * -> 두 개의 변수의 관계를 따지는 연산자, 다른 말로 비교 연산자라고도 함
		 * -> 관계 연산자는 조건을 만족하면 true, 만족하지 못하면 false를 반환
		 * 
		 * <    ex) a < b    a가 b보다 작은가?
		 * >    ex) a > b    a가 b보다 큰가?
		 * ==   ex) a == b   a와 b가 같은가?
		 * !=   ex) a != b   a와 b가 다른가?
		 * <=   ex) a <= b   a가 b보다 작거나 같은가?
		 * >=   ex) a >= b   a가 b보다 크거나 같은가? 
		 * 
		 * */
		
		/*int a = 10;
		int b = 20;*/
		int a = 10, b = 20;
		boolean result1, result2, result3;
		
		result1 = (a == b);
		result2 = (a <= b);
		result3 = (a > b);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

	public static void main(String[] args) {
		D_비교연산자 test = new D_비교연산자();
		test.opTest();
	}

}















