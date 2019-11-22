package com.kh.arrayPractice2.sample;

import java.util.Scanner;

public class Exercise {
	public void test1() {
		int[] iarr = new int[10];
		
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = i + 1;
		}
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}
	public void test2() {
		String sarr[] = {"딸기", "바나나", "복숭아", "키위", "사과"};
		
		System.out.println(sarr[1]);
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 하나 입력하세요 : ");
		String str = sc.nextLine();
		System.out.print("검색할 문자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		int count = 0;
		
		/*char carr[] = new char[str.length()];
		
		for(int i = 0; i < carr.length; i++) {
			carr[i] = str.charAt(i);
		}*/
		
		char[] carr = str.toCharArray();
		
		for(int i = 0; i < carr.length; i++) {
			if(carr[i] == c) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 : " + str + "에서 찾으시는 문자 "
				         + c + "는 " + count + "개 입니다.");
		
		
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		String str = sc.nextLine();
		
		char crr[] = str.toCharArray();
		char crr2[] = crr.clone();
		
		for(int i = 0; i < crr2.length; i++) {
			if(i >= 8) {
				crr2[i] = '*';
			}
			System.out.print(crr2[i]);
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1 && num > 0) {
			int iarr[] = new int[num];
			int mid = num / 2;
			int ctn = 0;
			
			for(int i = 0; i <= mid; i++) {
				iarr[i] = ++ctn;
			}
			for(int i = mid + 1; i < iarr.length; i++) {
				iarr[i] = --ctn;
			}
			for(int i = 0; i < iarr.length; i++) {
				System.out.println(iarr[i] + " ");
			}
			
		
		}else {
			System.out.println("양수 혹은 홀수만 입력해야 합니다.");
		}
		
	}
	
	public void test6() {
		//로또 번호 생성(중복제거, 오름차순 정렬)
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		int lottoAsc[] = lotto.clone();
		
		for(int i = 0; i < lottoAsc.length; i++) {
			for(int j = 0; j < lottoAsc.length; j++) {
				if(lottoAsc[i] < lottoAsc[j]) {
					int temp;
					temp = lottoAsc[i];
					lottoAsc[i] = lottoAsc[j];
					lottoAsc[j] = temp;
				}
			}
		}
		for(int i = 0; i < lottoAsc.length; i++) {
			System.out.println(lottoAsc[i] + " ");
		}
		
		
	}
}























