package com.kh.chap03_field.part01_kindsOfVariable;

//변수 선언 위치에 따른 구분
public class KindsOfVariable {	//클래스 영역의 시작
	//클래스 영역에 작성하는 변수를 필드라고 한다.
	//필드 == 멤버변수(클래스가 가지는 멤버라는 의미)
	//   == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	//   == 인스턴스변수(인스턴스 생성 시 할당받는 변수라는 의미)
	private int globalNum;
	
	public void testMethod(int num) {	//메소드 영역의 시작
		//메소드 영역에서 작성하는 변수를 지역변수라고 한다.
		//메소드의 괄호 안에 작성하는 변수를 매개변수라고 한다.
		//매개변수도 일종의 지역변수로 생각하면 된다.
		int localNum;
		
		//지역 변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어 있어야 한다.
		/*System.out.println(localNum);*/
		
		//매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.
		System.out.println(num);
		
		//전역변수는 클래스 전역에서 사용 가능하다.
		System.out.println(globalNum);
		
	}	//메소드 영역의 끝
	
	public void testMethod2() {
		//지역변수는 해당 지역(블럭 내)에서만 사용 가능하다.
		/*System.out.println(localNum);*/
		//전역변수는 다른 메소드에서도 사용 가능하다.
		System.out.println(globalNum);
	}
	
	
	
}	//클래스 영역의 끝
















