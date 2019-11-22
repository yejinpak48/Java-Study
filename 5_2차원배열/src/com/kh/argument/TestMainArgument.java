package com.kh.argument;

public class TestMainArgument {

	public static void main(String[] args) {
		//args로 값 전달 확인 테스트
		System.out.println("전달값 갯수 : " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(i + "번째 값 : " + args[i]);
		}
	}

}
