package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

//추상클래스를 상속받을 때 extends 키워드를 사용한다.
public class SmartPhone extends Product{
	
	//상속받은 부모의 추상메소드는 반드시 오버라이딩 해야 한다.
	@Override
	public void abstMethod() {}
	
	public void printSmartPhone() {
		System.out.println("SmartPhone클래스의 printSmartPhone() 메소드 실행...");
	}
	
	@Override
	public String toString() {
		return "SmartPhone클래스의 toString()메소드 실행...";
	}

}















