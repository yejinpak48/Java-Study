package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class B_while {
	public void testWhile() {
		int i = 0;
		while(i <= 5) {
			System.out.println(i + "번째 반복문 수행중...");
			i++;
		}
		
	}
	
	public void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
		
	}
	
	public void testWhile3() {
		//1부터 입력받은 수 까지의 정수들의 합
		System.out.println("정수를 하나 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum += i;
			if(i != num) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
			i++;
		}
		System.out.println();
		System.out.println(sum);
		
	}
	
	public void testWhile4() {
		//while문을 이용하여 구구단을 2단부터 9단까지 출력하세요
		int dan = 2;
		while(dan < 10) {
			int su = 1;
			while(su < 10) {
				System.out.println(dan + " * " + su 
									+ " = " + (dan * su));
				su++;
			}
			System.out.println();
			dan++;
		}
	}
	
	public void testWhile5() {
		//줄 수와 칸 수를 입력받아 칸 수만큼의 '*'을 줄 수만큼 출력
		//단, 줄 수와 칸 수가 같으면 줄 수에 해당하는 정수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		int r = 1;
		while(r <= row) {
			int c = 1;
			while(c <= col) {
				if(r == c) System.out.print(r);
				else System.out.print("*");
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
}



















