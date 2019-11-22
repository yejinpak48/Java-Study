package com.kh.chap00_beforeTest;

import java.util.Random;

public class MathTest {
	/*
	 * 자바에서는 클래스가 제공하는 필드(전역변수)나 메소드 사용시
	 * 반드시 new를 사용해 객체를 생성해야 사용할 수 있다.
	 * 해당하는 주소를 가진 레퍼런스를 이용해 실행해야만 한다.
	 * 클래스명 레퍼런스변수명 = new 클래스명();
	 * 레퍼런스변수명.메소드명();  -> non-static 메소드 일 경우
	 * 
	 * static 메소드인 경우 호출하기 위해 new를 사용하지 않아도 된다.
	 * 클래스명.메소드명();  -> static 메소드인 경우에 메소드 호출 방법
	 * 클래스명.필드명; -> static 필드에 대한 접근
	 * 
	 * */
	
	//java.lang.Math클래스 테스트
	public void testMath() {
		
		System.out.println("상수 PI : " + Math.PI);
		
		System.out.println("-7의 절대값 : " + Math.abs(-7));
		System.out.println("-123.5의 절대값 : " + Math.abs(-123.5));
		
		//난수 : 임의의 값, 무작위로 만들어지는 알 수 없는 값
		System.out.println("임의의 난수 : " + Math.random());
		
	}
	public void testRandom() {
		//1부터 100까지의 난수 구하기
		//int random = (int)(Math.random() * 100) + 1;
		
		//1부터 3까지의 난수 발생
		int random = new Random().nextInt(3) + 1;
		
		System.out.println("random : " + random);
	}
	
	public void practiceRandom() {
		//사용자가 원하는 랜덤 범위의 값 추출하기
		//0~9까지의 랜덤수
		//1~10까지의 랜덤수
		//20~35까지의 랜덤수
		//0 또는 1
		
		//위의 4가지 범위의 난수를 출력하는 구문을
		//Math.random()과 Random클래스의 nextInt()를 이용하여 출력
		
		
	}

	public static void main(String[] args) {
		MathTest mt = new MathTest();
		//mt.testMath();
		mt.testRandom();
	}

}















