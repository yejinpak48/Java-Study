package com.kh.first;

public class A_MethodPrinter { //클래스 선언부
	
	public void methodA() {
		System.out.println("methodA() 호출됨...");
		methodB();
	}
	public void methodB() {
		System.out.println("methodB() 호출됨...");
		methodC();
	}
	public void methodC() {
		System.out.println("methodC() 호출됨...");
	}
	public static void main(String[] args) {
		//자바에서는 클래스가 가진 메소드를 실행하려면
		//아래와 같이 사용해야 한다.
		//클래스명 사용할이름 = new 클래스명();
		//사용할이름.메소드명();
		A_MethodPrinter p = new A_MethodPrinter();
		p.methodA();
		/*p.methodB();
		p.methodC();*/
	}

}




