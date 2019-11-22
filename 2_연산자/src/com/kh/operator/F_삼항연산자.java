package com.kh.operator;

import java.util.Scanner;

public class F_삼항연산자 {
	public void opTest() {
		//항목이 3개인 연산자
		//(조건식)?참일때사용할값:거짓일때사용할값;
		//조건식은 반드시 결과가 true 혹은 false가 나오게끔 작성해야 함
		//비교/논리연산자가 주로 사용됨
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		//String result = (num > 0)? "양수다":"양수가 아니다";
		
		//중첩으로 사용도 가능하다
		String result = (num > 0)?"양수다":(num == 0)?"0이다":"양수가 아니다";
		
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		new F_삼항연산자().opTest();
	}

}














