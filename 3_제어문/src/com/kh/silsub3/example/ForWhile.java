package com.kh.silsub3.example;

import java.util.Scanner;

public class ForWhile {
	private Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("정수 하나 입력 : ");
		int row = sc.nextInt();
		
		if(row > 0) {
			for(int r = 1; r <= row; r++) {
				for(int c = 1; c <= r; c++) {
					if(r == c) {
						System.out.print(r);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	public void printStar2() {
		System.out.print("정수를 하나 입력하세요 : ");
		int row = sc.nextInt();
		
		if(row > 0) {
			for(int r = 1; r <= row; r++) {
				for(int c = 1; c <= r; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else if (row < 0) {
			for(int r = (-row); r > 0; r--) {
				for(int c = 1; c <= r; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else {
			System.out.println("출력 기능이 없습니다.");
		}
	}
	
	public void countInputCharacter() {
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			
			if(!((temp >= 'A' && temp <= 'Z') 
					|| (temp >= 'a' && temp <= 'z'))) {
				System.out.println("영문자가 아닙니다.");
				return;
			}
		}
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("포함된 갯수 : " + count + "개");
		
		
	}
	
}





















