package com.kh.chap00_beforeTest;

import java.util.Scanner;

public class ScannerTest {
	//java.util.Scanner 클래스의 next(), nextLine() 테스트
	//next() : 공백이 없는 연속된 문자열의 값 입력시 사용
	//nextLine() : 공백이 포함된 문자열의 값 입력시 사용
	public void testScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		System.out.println("str : " + str);
		
		//버퍼의 한 줄 읽기(즉, 버퍼 비우기)
		sc.nextLine();
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		
		System.out.print("공백이 있는 문자열을 입력하세요 : ");
		//엔터 값이 그대로 남아 있기 때문에 버퍼 비우기를 해야 한다.
		sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println("str2 : " + str2);
		
		
	}

	public static void main(String[] args) {
		new ScannerTest().testScanner();

	}

}















