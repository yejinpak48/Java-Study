package com.kh.operator;

import java.util.Scanner;

public class E_일반논리연산자 {
	public void opTest1() {
		//&&(그리고, ~면서) : 11순위
		//||(또는, ~거나) : 12순위
		//논리값 && 논리값, 논리값 || 논리갑
		
		//예시)
		//논리값 && 논리값 || 논리값 && 논리값
		//=> (논리값 && 논리값) || (논리값 && 논리값)
		
		// 1 <= 변수 <= 100 이렇게 사용 못함
		// 변수 >= 1 && 변수 <= 100
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100 사이인지 확인 : " 
							+ (num >= 1 && num <= 100));
		
		//5~10 사이의 범위에 해당하지 않은 값이면 true 맞으면 false를 리턴
		System.out.println("5~10 사이의 값이 아닌지 확인 : "
				            + !(num >= 5 && num <= 10));
		
		//영어 대문자냐?
		//--> 문자변수 >= 'A' && 문자변수 <= 'Z'
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("영어 대문자인지 확인 : " 
							+ (ch >= 'A' && ch <= 'Z'));
		
		// || : 여러 값을 제시하고 그 중에 하나라도 맞는게 있는지 물어볼 때 사용
		// 입력 문자가 대 소문자 상관 없이 'y' 혹은 'Y'인지 물어볼 때
		// 문자변수 == 'y' || 문자변수 == 'Y'
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("영문자 y 혹은 Y인지 확인 : " 
		                    + (ch2 == 'y' || ch2 == 'Y'));
		
		// 알파벳 대문자 이거나 소문자인지 확인
		System.out.print("문자 하나 입력 : ");
		char ch3 = sc.next().charAt(0);
		
		System.out.println("알파벳인지 확인 : " + 
					((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')));
		
	}
	public void opTest2() {
		//논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
		//논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
		int num = 10;
		
		int result = (false && ++num > 0)?num:num;
		
		System.out.println("&& 확인 : " + num);
		
		result = (true || ++num > 0)?num:num;
		
		System.out.println("|| 확인 : " + num);
		
		
	}

	public static void main(String[] args) {
		E_일반논리연산자 test = new E_일반논리연산자();
		//test.opTest1();
		test.opTest2();
	}

}



















