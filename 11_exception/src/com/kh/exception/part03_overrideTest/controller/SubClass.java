package com.kh.exception.part03_overrideTest.controller;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass{
	
	//같은 예외를 던져주는 구문으로 오버라이딩 해야 한다.
	/*@Override
	public void method() throws IOException{}*/
	
	//부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 할 수 없다.
	/*@Override
	public void method() throws Exception() {}*/
	
	//부모의 예외처리 클래스보다 더 하위에 있는(즉, 더 구체적인 예외상황)인 경우
	//오버라이딩을 할 수 있다.
	@Override
	public void method() throws FileNotFoundException {}
	
	
	
}













