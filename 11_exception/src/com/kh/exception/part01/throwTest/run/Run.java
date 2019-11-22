package com.kh.exception.part01.throwTest.run;

import com.kh.exception.part01.throwTest.controller.ThrowTest;

public class Run {

	public static void main(String[] args)/* throws Exception*/{
		ThrowTest tt = new ThrowTest();
		
		//try catch로 해결해야 한다.
		try {
			tt.methodA();
			
			System.out.println("예외가 발생하지 않았습니다.");
			
		}catch(Exception e) {
			//System.out.println("예외상황이 발생하였습니다.");
			//예외 내용과 발생 위치를 콘솔에 출력해주는 메소드
			/*e.printStackTrace();*/
			System.out.println(e.getMessage());
		}
		
		System.out.println("정상적으로 종료됨...");
	}

}







