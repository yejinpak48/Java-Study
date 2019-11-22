package com.kh.operator;

public class G_복합대입연산자 {
	public void opTest() {
		//다른 연산자와 대입 연산자를 함께 사용하는 연산자를 말함
		//산술 대입 연산자 : +=, -=, *=, /=, %=
		//연산 처리속도가 훨씬 빠르므로 사용 권장함
		/*
		 * += : 왼쪽과 오른쪽의 값을 더한 후 값을 왼쪽 공간(변수)에 대입
		 * -= : 왼쪽과 오른쪽의 값을 뺀 후 값을 왼쪽 공간(변수)에 대입
		 * *= : 왼쪽과 오른쪽의 값을 곱한 후 값을 왼쪽 공간(변수)에 대입
		 * /= : 왼쪽과 오른쪽의 값을 나눈 후 값을 왼쪽 공간(변수)에 대입
		 * %= : 왼쪽과 오른쪽의 값을 나누고 나머지 값을 왼쪽 공간(변수)에 대입 
		 * 
		 * */
		int num = 12;
		
		System.out.println("num : " + num);
		
		num = num + 3;
		System.out.println("num : " + num);
		
		num += 3;	//연산 속도가 더 빠름, 메모리에 직접 연산 수행
		System.out.println("num : " + num);
		
		num -= 5;	//num = num - 5;
		System.out.println("num : " + num);
		
		num *= 2;	//num값 2배 증가
		System.out.println("num : " + num);
		
		num /= 2;	//num값 2배 감소
		System.out.println("num : " + num);
 		
	}

	public static void main(String[] args) {
		new G_복합대입연산자().opTest();

	}

}


















