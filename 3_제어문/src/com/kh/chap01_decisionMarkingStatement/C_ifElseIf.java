package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class C_ifElseIf {
	//if else if 구문은 다중 조건을 줄 수 있는 문법이다.
	
	//[표현식]
	//if(조건식){
	//		첫 번째 조건식이 참 인 경우 동작할 내용
	//}else if(조건식){
	//		두 번째 조건식이 참 인 경우 동작할 내용
	//}else{
	//		모든 조건이 거짓인 경우 동작할 내용
	//}
	
	public void testIfElseIf() {
		//점수를 하나 입력 받아 등급을 나누어 점수와 등급을 출력하세요
		//등급은, 90점 이상은 A등급
		//90점 미만 80점 이상은 B등급
		//80점 미만 70점 이상은 C등급
		//70점 미만 60점 이상은 D등급
		//60점 미만은 F등급으로 나눈다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		char grade = ' ';
		
		if(point >= 90) {
			grade = 'A';
		}else if(/*point < 90 &&*/ point >= 80) {
			grade = 'B';
		}else if(/*point < 80 &&*/ point >= 70) {
			grade = 'C';
		}else if(/*point < 70 &&*/ point >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는  %d점이고, 등급은 %c입니다.", point, grade);

		//printf 포맷
		//포맷문자와 값은 갯수와 자료형이 일치해야 한다.
		//System.out.printf("%형식", 값(혹은 변수)); 의 형태로 사용한다.
		//-> 정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)를 줄바꿈 하지 않고 출력한다.
		
		//포맷문자
		// %d : 정수형
		// %o : 8진수
		// %x : 16진수
		// %f : 실수(소수점 아래 6자리)
		// %e : 지수표현식(과학적 표기법)
		// %c : 문자
		// %s : 문자열
		// %b : 논리형
		// %5d : 5칸을 확보하고 오른쪽 정렬
		// %-5d : 5칸을 확보하고 왼쪽 정렬
		// %.2f : 소수점 아래 2자리 까지만 표시
		
		//특수문자(escape 문자)
		// tab : \t         정해진 공간만큼 띄어쓰기
		// new line : \n    출력하고 다음 라인으로 옮김
		// 역슬래쉬 : \\       특수문자(\)사용
		// 작은따옴표 : \'     특수문자(') 사용
		// 큰따옴표 : \"       특수문자(") 사용
		// 유니코드 : \u0001     유니코드 표시할 때 사용
	}
	public void testIfElseIf2() {
		//위의 문제에서 각 등급별 중간 점수 이상의 경우에는
		//등급에 "+"라는 문자를 추가하여 출력하세요
		//예) 95점 이상은 등급이 A+로 출력되게 함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		String grade = "";
		
		if(point >= 90) {
			grade = "A";
			if(point >= 95) {
				grade += "+";
			}
		}else if(point >= 80) {
			grade = "B";
			if(point >= 85) {
				grade += "+";
			}
		}else if(point >= 70) {
			grade = "C";
			if(point >= 75) {
				grade += "+";
			}
		}else if(point >= 60) {
			grade = "D";
			if(point >= 65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 점수는 %d이고, 등급은 %s입니다.", point, grade);
	}
}






















