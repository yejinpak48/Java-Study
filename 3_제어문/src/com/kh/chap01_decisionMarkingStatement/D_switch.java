package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class D_switch {
	//변수의 값을 case에서 찾아 명령을 수행하는 조건문이다.
	//해당하는 값이 없을 경우에는 default의 명령문을 수행한다.
	
	//case와 명령문 사이에는 콜론(:)을 써야 한다.
	//break가 없으면 멈추지 않고 계속 수행한다.
	
	//[표현식]
	//switch(변수) {
	//   case 1 : 실행문1; break;		//변수 값이 1일 경우 실행
	//   case 2 : 실행문2; break;		//변수 값이 2일 경우 실행
	//   case 3 : 실행문3; return;	//변수 값이 case문에 없을 경우 실행
	//}
	
	public void testSwitch() {
		//정수 두 개와 연산기호 1개를 입력받아서
		//연산기호문자에 해당하는 계산을 수행하고 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 값 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 값 : ");
		int second = sc.nextInt();
		System.out.print("연산자(+,-,*,/) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
			case '+' : result = first + second; break;
			case '-' : result = first - second; break;
			case '*' : result = first * second; break;
			case '/' : result = first / second; break;
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
		
	}
	
	public void testSwitch2() {
		//1월~ 12월까지를 정수로 입력받아
		//해당하는 달이 몇일 까지인지 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월 까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
			case 12 : System.out.println("입력하신 월은 31일 까지입니다."); break;
				
			case 4 : case 6 : case 9 :
			case 11 : System.out.println("입력하신 월은 30일 까지입니다."); break;
				
			case 2 : System.out.println("입력하신 월은 28일 혹은 29일 까지입니다."); break;
			default : System.out.println("반드시 1월~12월 까지를 입력해야 합니다."); return;
		}
		
	}
	
	
	
}






















