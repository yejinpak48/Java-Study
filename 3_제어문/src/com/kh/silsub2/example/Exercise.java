package com.kh.silsub2.example;

import java.util.Scanner;

public class Exercise {
	public void exercise1(){
		// 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,홀수이면 "홀수다.", 소수가 아니면 "짝수다." 출력
		// 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		if(num > 0 && num <= 10){
			if(num % 2 == 0){
				System.out.println("짝수다.");
			}else{
				System.out.println("홀수다.");
			}
		}else{
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
	}

	public void exercise2(){
		// BMI(신체질량지수)를 계산하고, 계산된 값에 따라 저체중(20 미만), 
		// 정상체중(20이상 25미만), 과제충(25이상 30미만), 비만(30이상)을 출력하시오.
		// 단, BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
		// 예시 BMI = 67 / (1.7 * 1.7)
		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요(cm) : ");
		float height = sc.nextFloat() / 100;
		System.out.print("몸무게를 입력하세요(Kg) : ");
		float weight = sc.nextFloat();

		float bmi = weight / (height * height);

		if(bmi < 20){
			System.out.println("당신은 저체중 입니다.");
		}else if(bmi < 25){
			System.out.println("당신은 정상체중 입니다.");
		}else if(bmi < 30){
			System.out.println("당신은 과체중 입니다.");
		}else{
			System.out.println("당신은 비만입니다.");
		}
	}

	public void exercise3(){
		// 두 개의 정수를 입력받고, 연산기호(+, -, *, /, %)를 입력받아 해당 연산의 수행 결과를 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.print("연산기호를 입력하세요 : ");
		char op = sc.next().charAt(0);

		switch(op){
			case '+' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 + num2); break;
			case '-' : System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2)); break;
			case '*' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 * num2); break;
			case '/' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 / num2); break;
			case '%' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 % num2); break;
			default : System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다."); break;
		}
	}

	public void exercise4(){
		// 과일 이름("사과", "바나나", "복숭아", "키위")을 입려하면 해당하는 가격에 맞게 상품명과 가격이 출력되게 하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요 : ");
		String product = sc.nextLine();
		int price = 0;

		switch(product){
		case "사과" : price = 1000;  break;
		case "바나나" : price = 3000;  break;
		case "복숭아" : price = 2000;  break;
		case "키위" : price = 5000;  break;
		default : System.out.println("준비된 상품이 없습니다."); break;

		}
		System.out.println(product + "의 가격은 " + price + "원 입니다.");
		
	}
	
	public void exercise5(){
		//국어, 영어, 수학 점수를 입력받아 
		// 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다"출력,
		// 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 출력
		// 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();

		int avg = (kor + eng + math) / 3;

		if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40){
			System.out.println("합격입니다!");
		}else{
			if(avg < 60){
				System.out.println("평균점수 미달로 불합격 입니다.");
			}
			
			if(kor < 40){
				System.out.println("국어점수 미달로 불합격 입니다.");
			}
			
			if(eng < 40){
				System.out.println("영어점수 미달로 불합격 입니다");
			}
			
			if(math < 40){
				System.out.println("수학점수 미달로 불합격 입니다");
			}
		}
	}
	
	public void exercise6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 급여 입력 : ");
		int salary = sc.nextInt() ;
		
		System.out.print("월 매출액 입력 : ");
		int income = sc.nextInt();
		
		double bonusRate = 0;
		int totalSalary = 0;
		
		if(income >= 50000000){
			bonusRate = 0.05;
		}else if(income >= 30000000){
			bonusRate = 0.03;
		}else if(income >= 10000000){
			bonusRate = 0.01;
		}else{
			bonusRate = 0;
		}
		
		totalSalary = salary + (int)(income * bonusRate);
		System.out.println("======================");
		System.out.println("매출액 : " + income);
		System.out.println("보너율 : " + bonusRate + "%");
		System.out.println("월 급여 : " + salary);
		System.out.println("보너스 금액 : " + (int)(bonusRate * income));
		System.out.println("======================");
		System.out.println("총 급여 : " + totalSalary);
	}
}
