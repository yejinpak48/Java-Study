package com.kh.chap05_method.part02_methodTest;

import static com.kh.chap05_method.part02_methodTest.StaticMethodTest.*;

public class Run {

	public static void main(String[] args) {
		NonStaticMethodTest test = new NonStaticMethodTest();
		test.method1();
		
		//매개변수가 없고 반환값이 있는 메소드 호출의 경우
		//리턴타입과 일치하는 자료형의 변수에
		//메소드 수행 결과를 담아서 사용한다.
		
		/*String str = test.method2();
		System.out.println(str);*/
		
		System.out.println(test.method2());
		
		
		//매개변수가 있고 반환값이 없는 메소드의 호출의 경우
		//반드시 인자로 매개변수의 타입, 갯수, 순서가 일치하는 값을 넘겨줘야 한다.
		int a = 10;
		int b = 20;
		test.method3(a, b);
		
		
		int result = test.method4(10, 20);
		System.out.println("result : " + result);
		
		//static 메소드 호출시에는 객체를 생성하지 않고 호출한다.
		//사용방법은 클래스명.메소드명()으로 사용한다.
		//클래스명을 사용하지 않으려면 static import를 해야 한다.
		//import static 패키지명.클래스명.*;
		StaticMethodTest.staticMethod1();
		
		System.out.println("10과 20의 합은 : " + StaticMethodTest.staticMethod2() + "입니다.");
		
		StaticMethodTest.staticMethod3("김진호");
		
		System.out.println(StaticMethodTest.staticMethod4("김진호"));
	}

	
}


















