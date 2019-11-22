package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class C_doWhile {
	public void testDoWhile() {
		//키보드로 영어 문자열 값을 입력 받아 출력 반복 진행
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
		}while(!str.equals("exit"));
	}
	
	public void testDoWhile2() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
		}while(true);
		
	}
}















