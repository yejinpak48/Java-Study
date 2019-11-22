package com.kh.silsub1.example;

import java.util.Scanner;

public class Munjea {
	//문제 1
	public void test1(){
		Scanner scan = new Scanner(System.in);

		System.out.print("국어 점수 : ");
		int kr = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();

		int sum = (kr + eng + math);
		double avg = sum/3.0;

		System.out.println("합계 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);

		if(kr >= 40 && eng >= 40 && math >= 40 && avg >= 60){
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		}else{
			System.out.println("불합격");
		}				
	}			
	//문제 2
	public void test2(){
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호 입력 : ");
		int num = sc.nextInt();

		switch(num){  
		case 1 : System.out.println("입력메뉴가 선택되었습니다."); break;
		case 2 : System.out.println("수정메뉴가 선택되었습니다."); break;
		case 3 : System.out.println("조회메뉴가 선택되었습니다."); break;
		case 4 : System.out.println("삭제메뉴가 선택되었습니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("번호가 잘못 입력되었습니다." + "\n" 
				+ "다시 입력하십시오."); return;
		}
	}
	//문제 3
	public void test3(){
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하시오 : ");
		int num = sc.nextInt();

		if(num > 0){
			System.out.println("양수다.");
		}else{
			System.out.println("양수가 아니다.");	
		}
	}
	//문제 4
	public void test4(){
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하시오 : ");
		int num = sc.nextInt();

		if(num % 2 == 0){
			System.out.println("짝수다.");
		}else{
			System.out.println("홀수다.");
		}
	}
	//문제 5
	public void test5(){
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();

		if(name.length() > 0 && name != null && age > 0 && height > 0){
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println(name + "의 나이는 " + age + "이고, 키는 " 
					+ height + "cm 이다.");
		}
	}
	//문제 6
	public void test6(){
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		if(num1 > 0 && num2 > 0){
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		}
	}
	//문제 7
	public void test7(){
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();

		char grade = ' ';

		if(score >0){
			if(score >= 90){
				grade = 'A';
			}else if(score > 80){
				grade = 'B';
			}else if(score > 70){
				grade = 'C';
			}else if(score > 60){
				grade = 'D';
			}else{
				grade = 'F';
			}
			System.out.println("점수 : " + score);
			System.out.println("학점 : " + grade);
		}
	}
}
