package com.kh.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	public void test1() {
		Random r = new Random();
		int[] ar = new int[10];
		int sum = 0;
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(100) + 1;
			sum += ar[i];
		}
		System.out.println("sum : " + sum);
	}
	
	public void test2() {
		int[] ar = new int[10];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random() * 100) + 1;
		}
		
		int max = ar[0];
		int min = ar[0];
		
		for(int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
	}
	
	public void test3() {
		Random r = new Random();
		byte[] bar = new byte[10];
		int sum = 0;
		
		r.nextBytes(bar);
		
		for(int i = 0; i < bar.length; i++) {
			System.out.println(i + " : " + bar[i]);
			if(bar[i] % 2 == 0) {
				sum += bar[i];
			}
		}
		System.out.println("sum : " + sum);
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자 입력 : ");
		String value = sc.next();
		
		if(value != null && value.length() > 0) {
			for(int i = 0; i < value.length(); i++) {
				/*String s = value.substring(i, i + 1);
				int num = Integer.parseInt(s);*/
				//parsing : "3"을 숫자 3으로 바꿈
				//기본자료형을 문자열로 변경 : 3 -> "3"
				// => 3 + "";
				sum += Integer.parseInt(value.substring(i, i + 1));
			}
		}else {
			System.out.println("입력된 값이 없습니다.");
		}
		System.out.println("합계 : " + sum);
		
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		/*char ch = '2';
		System.out.println((int)ch);*/
		
		System.out.println("숫자 입력 : ");
		String value = sc.nextLine();
		
		if(value != null && value.length() > 0) {
			for(int i = 0; i < value.length(); i++) {
				sum += (int)value.charAt(i) - 48;
			}
			
		}else {
			System.out.println("입력된 값이 없습니다.");
		}
		System.out.println("sum : " + sum);
	}
}





















