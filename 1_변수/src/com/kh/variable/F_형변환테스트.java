package com.kh.variable;

public class F_형변환테스트 {
	//(바꿀자료형)값 또는 (바꿀자료형)변수
	//casting연산자 : 값의 자료형을 바꿀 때 사용한다.
	//형변환 : 자동(묵시적)형변환, 강제(명시적)형변환이 있다.
	
	//컴퓨터에서의 값 처리 규칙
	//1. 같은 자료형 끼리만 대입이 가능하다. 다른 자료형의 값을 대입할 시 형변환 필요
	//2. 같은 자료형 끼리만 계산할 수 있으며, 계산의 결과도 같은 자료형이다.
	//3. 기본적으로 정수형은 실수형으로 자동 형변환이 가능하지만,
	//   실수형은 정수형으로 강제 형변환을 해야 한다.
	//   10 -> 10.0 자동형변환 가능, 10.5 -> 10 강제형변환 필요
	
	public void rule1() {
		boolean flag = true;
		//boolean 자료형은 무조건 true, false만 들어간다(형변환 예외)
		//flag = (boolean)1;
		
		//자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장할 수 있다
		//=> 자동형변환
		//하지만 큰 변수 타입은 작은 변수 타입으로 자동 변환되지 않기 때문에
		//형변환을 명시해 주어야 한다.
		//=> 강제형변환
		//변경할 값 앞에 (변경할타입)을 지정해 주면 된다.
		
		//자동 형변환이 일어남
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;
		System.out.println("ch : " + ch);
		
		//char ch2 = -97;  //문자는 음수를 저장할 수 없다.
		
		//int 자료형 변수의 값은 char 자료형에 대입하기 위해 강제 형변환을 해야 한다
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		
		//음수를 저장한 변수를 char로 강제 형변환을 하게 되면
		//char는 부호비트가 없기 때문에 문자로 인식하지 못한다.
		//물음표는 문자의 의미가 아닌 없는 문자라는 뜻이다.
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		
	}
	
	public void rule2() {
		//다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
		int inum = 10;
		long lnum = 100;
		
		//방법 1. 수행 결과를 int로 강제 형변환 한다.
		int isum = (int)(inum + lnum);
		
		System.out.println("isum : " + isum);
		
		//방법 2. long형 값을 int로 강제 형변환 한다.
		int isum2 = inum + (int)lnum;
		
		System.out.println("isum2 : " + isum2);
		
		//방법 3. long형 자료형으로 받는다.
		long sum = inum + lnum;
		
		System.out.println("sum : " + sum);
		
		//하지만 예외적으로 byte와 short의 연산 결과는 무조건 int가 된다.
		byte bnum = 1;
		short snum = 2;
		
		//강제 형변환을 적용한 경우
		short sum2 = (short)(bnum + snum);
		
		//혹은 실행 결과를 int형으로 저장해야 한다.
		int sum3 = bnum + snum;
	
	}
	
	public void rule3() {
		//정수는 실수로 자동 형변환이 된다.
		long lnum = 100;	//8byte
		
		float fnum = lnum;  //4byte
		
		System.out.println("fnum : " + fnum);
		
		//실수는 정수로 형변환 할 때 강제 형변환을 해 주어야 한다.
		double dnum = 10.5;
		
		//실수가 정수로 바뀔 때 소수점 이하를 절삭하기 때문에 데이터 손실이 일어난다.
		int inum = (int)dnum;
		
		System.out.println("inum : " + inum);
	}
	
	public void testDataloss() {
		//데이터 손실 테스트
		int inum = 290;
		
		System.out.println("inum : " + inum);
		
		byte bnum = (byte)inum;
		
		System.out.println("bnum : " + bnum);
	}
	
	

	public static void main(String[] args) {
		F_형변환테스트 test = new F_형변환테스트();
		//test.rule1();
		//test.rule2();
		//test.rule3();
		test.testDataloss();
	}

}















