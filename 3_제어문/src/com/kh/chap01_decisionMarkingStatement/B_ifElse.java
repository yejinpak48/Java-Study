package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class B_ifElse {
	//둘 중 한 개를 선택하는 조건문으로, 조건이 참인 경우와 거짓인 경우
	//수행하는 명령을 따로 작성하는 경우에 사용 한다.
	//조건을 비교하여 두 개의 명령 중 한 개는 무조건 수행을 한다.
	
	//[표현식]
	//if(조건식){
	//   조건이 참일 경우 실행할 내용 작성
	//}else{
	//   조건이 거짓일 경우 실행할 내용 작성
	//}
	
	//else에는 조건식을 사용하지 못함
	//if의 조건식이 거짓이면 무조건 else 블럭의 실행 코드를 수행함
	
	public void testIfElse() {
		//숫자를 하나 입력받아 홀수 짝수 구분하여 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		String str = "";
		
		if(num % 2 == 0) {
			str = "입력 하신 정수는 짝수입니다.";
		}else {
			str = "입력 하신 정수는 홀수입니다.";
		}
		
		System.out.println(str);
		
	}
	
	public void testIfElse2() {
		//숫자를 하나 입력 받아 양수인지 음수인지 출력
		//단, 0이면 "0입니다"라고 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		String str = "";
		
		if(num != 0) {
			if(num > 0) {
				str = "입력하신 숫자는 양수입니다.";
			}else {
				str = "입력하신 숫자는 음수입니다.";
			}
		}else {
			str = "입력하신 숫자는 0 입니다.";
		}
		
		System.out.println(str);
		
	}
	
	public void testIfElse3() {
		//정수 두 개를 입력 받아, 두 수의 산술연산을 처리해서 출력하세요
		//단, 두 수 모두 1부터 100 사이의 값이어야 함
		//둘 중 하나라도 범위에 속하지 않으면
		//"값은 1부터 100 사이어야 합니다." 출력되게 함
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int plus, minus, multi, div, mod;
		
		if((num1 >= 1 && num1 <= 100) 
				&& (num2 >= 1 && num2 <= 100)) {
			plus = num1 + num2;
			minus = num1 - num2;
			multi = num1 * num2;
			div = num1 / num2;
			mod = num1 % num2;
			
			System.out.println(num1 + " + " + num2 + " = " + plus);
			System.out.println(num1 + " - " + num2 + " = " + minus);
			System.out.println(num1 + " * " + num2 + " = " + multi);
			System.out.println(num1 + " / " + num2 + " = " + div);
			System.out.println(num1 + " % " + num2 + " = " + mod);
					
		}else {
			System.out.println("두 수 모두 1부터 100 사이의 값이어야 합니다.");
		}
		
		
	}
	
	
	
	
	
}















