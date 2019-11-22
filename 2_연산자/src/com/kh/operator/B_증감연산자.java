package com.kh.operator;

public class B_증감연산자 {
	// ++ : 1 증가의 의미이다, ++값 혹은 값++ 로 사용한다.
	// -- : 1 감소의 의미이다, --값 혹은 값-- 로 사용한다.
	
	//값 자체를 증가시키거나 감소시킬 때는 어느 위치에 연산을 해도 동일한 결과가 나온다.
	public void test1() {
		int age = 20;
		
		System.out.println("현재 나이는 ? " + age);
		
		++age;
		System.out.println("++age의 결과는 ? " + age);
		
		age++;
		System.out.println("age++의 결과는 ? " + age);
		
		--age;
		System.out.println("--age의 결과는 ? " + age);
		
		age--;
		System.out.println("age--의 결과는 ? " + age);
		
	}
	
	public void test2() {
		int num1 = 20;
		
		//계산을 먼저 처리하고 난 후 증가 처리 됨
		int result = num1++ * 3;
		
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		
		int num2 = 20;
		
		int result2 = ++num2 * 3;
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
	}

	public static void main(String[] args) {
		B_증감연산자 test = new B_증감연산자();
		//test.test1();
		test.test2();
	}

}












