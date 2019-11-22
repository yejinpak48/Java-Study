package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class A_for {
	public void testFor() {
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(i + "번째 반복문 수행중...");
		}
		
	}
	
	public void testFor2() {
		//정수를 하나 입력 받아 그 수가 양수일 때만 그 수의 구구단을 출력하게 하고,
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력하여야 합니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~9까지의 양수를 하나 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan > 0 && dan < 10) {
			/*System.out.println(dan + " * " + 1 + " = " + (dan * 1));
			System.out.println(dan + " * " + 2 + " = " + (dan * 2));
			System.out.println(dan + " * " + 3 + " = " + (dan * 3));
			System.out.println(dan + " * " + 4 + " = " + (dan * 4));
			System.out.println(dan + " * " + 5 + " = " + (dan * 5));
			System.out.println(dan + " * " + 6 + " = " + (dan * 6));
			System.out.println(dan + " * " + 7 + " = " + (dan * 7));
			System.out.println(dan + " * " + 8 + " = " + (dan * 8));
			System.out.println(dan + " * " + 9 + " = " + (dan * 9));*/
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		}else {
			System.out.println("반드시 1~9 사이의 양수를 입력해야 합니다.");
		}
		
	}
	
	public void testFor3() {
		//1부터 100 사이의 임의의 난수까지의 정수들의 합계를 구하여 출력
		int random = (int)(Math.random() * 100) + 1;
		
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random + "까지 정수들의 합계 : " + sum);
		
		
	}
	
	public void testFor4() {
		//정수 두 개를 입력 받아 작은수부터 큰 수까지의 합계를 구하여 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		int max, min;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "에서 " + max + "까지의 정수들의 합계 : " + sum);
		
	}
	
	public void testFor5() {
		//for문 안에 for문을 사용할 수 있다.
		//예 : 구구단 2단부터 9단까지 출력
		
		//전체를 반복하는 for문
		for(int dan = 2; dan < 10; dan++) {
			//구구단 한 단을 출력하는 for문
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su 
										+ " = " + (dan * su));
			}
			System.out.println();
			
		}
		
		
		
	}
	
	public void testFor6() {
		//아날로그 시계 출력
		for(int hour = 0; hour < 12; hour++) {
			for(int min = 0; min < 60; min++) {
				System.out.println(hour + "시 " + min + "분");
			}
		}
	}
	
	public void testFor7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int c = 1; c <= 5; c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void testFor8() {
		//한 줄에 별표 문자를 입력한 줄 수와 칸 수만큼 입력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		/*
		 * 1*****
		 * *2****
		 * **3***
		 * ***4**
		 * ****5*
		 * *****6
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		for(int r = 1; r <= row; r++) {
			for(int c = 1; c <= col; c++) {
				if(r == c) {
					System.out.print(r);
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	
}
















