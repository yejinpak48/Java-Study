package com.kh.chap03_field.part01_kindsOfVariable;

//static 키워드에 대한 구분
public class KindsOfVariable2 {
	//전역변수에서 static 키워드 사용 가능하다.
	//전역변수 테스트
	public static int staticNum;
	
	//public 접근제한자에 static과 final 키워드를 함께 사용하는 것을
	//'상수필드' 라고 한다.
	//상수필드는 반드시 선언과 동시에 초기화가 되어야 한다.
	//프로그램 실행 시 static 키워드가 붙은 멤버는 전부 클래스영역(static area)에
	//저장되기 대문이다.
	//프로그램 시작 시 값이 저장되면 변경되지 않고 사용할 목적으로 사용한다.
	/*public static final int STATIC_NUM;*/
	
	//static 영역은 모든 객체가 공유할 목적으로 사용되기 때문에 
	//캡슐화 원칙에 위배된다.
	//따라서 static 키워드는 특별하게 명확한 목적이 있을 경우만 사용한다.
	public static final int STATIC_NUM1 = 1;
	//static과 final은 순서를 바꿔도 상관 없다.
	public final static int STATIC_NUM2 = 1;
	
	public void methodTest() {
		//지역변수에서는 static 키워드 사용이 불가능하다.
		//non-static 메소드는 객체가 만들어지고 호출해야만 실행하기 때문에
		//static 키워드를 변수에 붙일 수 없다.
		/*static int localStaticNum;*/
		
	}
	
	public static void staticMethodTest() {
		//static 메소드 내에서도 static 벼수 사용이 불가능하다.
		//static 메소드 내의 변수도 지역변수 이고,
		//메소드 호출 시 stack에 할당을 받는 변수이기 때문에
		//static 영역에 할당을 하라는 키워드는 사용 불가능하다.
		/*static int localStaticNum;*/
		
	}
	
}

















