package com.kh.inputTest;

public class TestCommandLine {

	public static void main(String[] args) {
		String name = args[0];
		char gender = args[1].charAt(0);
		int age = Integer.parseInt(args[2]);
		double height = Double.parseDouble(args[3]);
		double weight = Double.parseDouble(args[4]);
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);

	}

}












