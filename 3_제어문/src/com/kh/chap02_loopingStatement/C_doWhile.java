package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class C_doWhile {
	public void testDoWhile() {
		//Ű����� ���� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
		}while(!str.equals("exit"));
	}
	
	public void testDoWhile2() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
		}while(true);
		
	}
}















