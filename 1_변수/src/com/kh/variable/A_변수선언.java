//패키지 선언부
//클래스가 속한 패키지에 대한 선언을 반드시 해 주어야 한다.
//모든 클래스 파일의 가장 첫 줄에 작성한다.
package com.kh.variable;

public class A_변수선언 {
	//패키지가 다르면 같은 이름의 클래스도 만들 수 있다.
	//클래스의 이름은 사실 패키지를 포함한 이름이다.
	//ex) com.kh.variable.A_변수선언 <- 클래스의 fullName이다.
	public void declareVariable() {
		//숫자형
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;

		//실수형
		float fnum;
		double dnum;

		//문자형
		char ch;

		//논리형
		boolean isTrue;

		//문자열(참조형)
		String str;

		//변수 값 대입 후 출력
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;

		fnum = 4.0f;  //float는 리터럴에 반드시 f를 붙여야 한다.
		dnum = 8.0;   //double은 실수 값을 바로 입력해도 된다.

		isTrue = true;  //true or false 값만 저장할 수 있다.

		ch = 'a';
		str = "a";  //문자를 한 개만 써도 리터럴을 String 리터럴로 사용해야 한다.

		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);

		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);

		System.out.println("isTrue의 값 : " + isTrue);

		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);


	}

	public void initVariable() {
		//변수 선언과 동시에 초기화

		//숫자형
		//정수형
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8L;

		//실수형
		float fnum = 4.0f;
		double dnum = 8.0;

		//논리형
		boolean isTrue = true;

		//문자형
		char ch = 'a';

		//문자열
		String str = "a";

		//변수 값 출력하기
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);

		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);

		System.out.println("isTrue의 값 : " + isTrue);

		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);

	}
	
	public void namingRuleTest() {
		//1. 대소문자 구분한다.
		String userName;
		String username;
		
		//2. 예약어를 사용하면 안된다.
		//boolean true;    //예약어 사용해서 에러 발생
		boolean True;      //암묵적인 규칙에 의해 권장하지 않음
		
		//3. 숫자로 시작하면 안된다.
		int age1;
		//int 1age;    //숫자로 시작해서 에러 발생
		
		//4. 특수 문자는 '_'와 '$'만 허용한다.
		//double sh@rp;   //다른 특수 문자 사용시 에러 발생
		double $harp;
		
		//5. 여러 단어의 이름은 두 번째 단어의 앞 글자부터 첫 글짜마다 대문자로 표기
		//낙타봉 표기법(camel case)
		String ageOfVampire;
		String ageofvampire;  //에러가 발생하지 않지만 권장하지 않음(큰일남)
		
		//6. 한글 사용 가능(권장하지 않음 ->운영체제별 인코딩 방식이 다름)
		String 이름;
		
		//7. 상수의 경우 대문자로 표기
		final int AGE;
		final int age;  //암묵적인 규칙에 어긋남
		
		//8. 상수는 단어와 단어 사이를 '_'로 구분한다.
		final int MAXAGE;  //암묵적인 규칙에 어긋남
		final int MAX_AGE;
	}

	public static void main(String[] args) {
		A_변수선언 test = new A_변수선언();
		//test.declareVariable();
		test.initVariable();
	}

}












