package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class A_if {
	public void testIf() {
		//단독 if문
		//조건식의 결과 값이 참(true)이면 { } 안에 있는 코드를 실행하고,
		//조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드를 무시하고 넘어감
		
		//[표현식]
		//if(조건식){
		//  조건식이 true일 때 실행할 코드 작성
		//}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		//짝수인지 조건을 확인함
		if(num % 2 == 0) {
			//결과가 참일 때 수행함
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		//짝수가 아닌지 조건을 확인함(즉, 홀수인지 확인)
		if(num % 2 != 0) {
			//결과가 참일 때 수행함
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		
		//조건과 상관 없이 실행됨
		System.out.println("프로그램 종료");
	}
}















