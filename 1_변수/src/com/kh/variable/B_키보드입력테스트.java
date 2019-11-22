package com.kh.variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*import java.util.Scanner;*/

public class B_키보드입력테스트 {
	//java.io 패키지에서 제공되는 클래스를 이용한 키보드 입력 테스트
	public void inputTest1() {
		//구경용
		BufferedReader br 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//println과 print는 줄 바꿈 차이이다.
		System.out.print("정수 한 개를 입력하세요 : ");
		
		try {
			String value = br.readLine();  //문자열 형태로 읽어들임
			
			/*System.out.println("계산 결과 : " + (value * 3));*/
			
			//문자열 형태의 숫자를 실제 숫자 데이터로 변환 : parsing
			int number = Integer.parseInt(value);
			
			System.out.println("계산 결과 : " + (number * 3));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void inputTest2() {
		//java.util 패키지의 Scanner 클래스 사용
		//java 5버전 이후부터 추가됨
		
		//클래스의 fullName을 사용하면 import를 하지 않아도 된다.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();  //한 줄에 대한 정보를 읽어온다.
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();    //정수 값을 읽어온다.
		System.out.print("키(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble();  //실수로 값을 읽어온다.
		
		System.out.println(name + "님은" + age + " 세 이며, 키는 " 
		                   + height + "cm 입니다.");
		
		
	}
	
	
	public static void main(String[] args) {
		B_키보드입력테스트 test = new B_키보드입력테스트();
		//test.inputTest1();
		test.inputTest2();
		
	}
}


















