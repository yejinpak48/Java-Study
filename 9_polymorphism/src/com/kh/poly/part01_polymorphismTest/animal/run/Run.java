package com.kh.poly.part01_polymorphismTest.animal.run;

import java.util.Scanner;

import com.kh.poly.part01_polymorphismTest.animal.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerManager pm = new PlayerManager();
		
		System.out.print("아이디를 입력하세요 : ");
		String name = sc.nextLine();
		
		pm.startPlay(name);
	}

}













