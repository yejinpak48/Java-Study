package com.kh.exception.part01.throwTest.controller;

public class ThrowTest {
	
	public void methodA() throws Exception{
		System.out.println("methodA() 호출됨...");
		
		methodB();
		
		System.out.println("methodA() 종료됨...");
	}
	
	public void methodB() throws Exception{
		System.out.println("methodB() 호출됨...");
		
		methodC();
		
		System.out.println("methodB() 종료됨...");
	}
	
	public void methodC() throws Exception{
		System.out.println("methodC() 호출됨...");
		
		//강제적으로 exception 발생
		throw new Exception("예외발생!!");
		
		//강제적으로 에러를 발생시키면 비정상적으로 종료되기 때문에
		//아래의 내용이 실행되지 않아 에러 발생함
		//System.out.println("methodC() 종료됨...");
	}
	
	
	
}












