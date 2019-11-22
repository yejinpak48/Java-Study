package com.kh.variable;

import java.util.Scanner;

public class C_변수값변경테스트 {
	public void changeValue() {
		//변수 선언
		String name;	//이름
		char gender;	//성별
		int age;		//나이
		double height;	//키
		
		//초기화
		name = "김진호";
		gender = 'M';
		age = 20;
		height = 180.5;
		
		System.out.println(name + "님의 개인 정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		//키보드로 입력 받아 변수에 저장된 값 변경
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next().charAt(0);  //문자를 읽어오는 메소드가 없다.
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		String str = "안녕하세요";
		System.out.println(str.charAt(0));
		
		System.out.println("안녕하세요".charAt(0));
		
	}

	public static void main(String[] args) {
		C_변수값변경테스트 test = new C_변수값변경테스트();
		test.changeValue();
	}
}












