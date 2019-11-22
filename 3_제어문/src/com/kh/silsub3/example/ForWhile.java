package com.kh.silsub3.example;

import java.util.Scanner;

public class ForWhile {
	private Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("���� �ϳ� �Է� : ");
		int row = sc.nextInt();
		
		if(row > 0) {
			for(int r = 1; r <= row; r++) {
				for(int c = 1; c <= r; c++) {
					if(r == c) {
						System.out.print(r);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}else {
			System.out.println("����� �ƴմϴ�.");
		}
		
	}
	
	public void printStar2() {
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int row = sc.nextInt();
		
		if(row > 0) {
			for(int r = 1; r <= row; r++) {
				for(int c = 1; c <= r; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else if (row < 0) {
			for(int r = (-row); r > 0; r--) {
				for(int c = 1; c <= r; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else {
			System.out.println("��� ����� �����ϴ�.");
		}
	}
	
	public void countInputCharacter() {
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			
			if(!((temp >= 'A' && temp <= 'Z') 
					|| (temp >= 'a' && temp <= 'z'))) {
				System.out.println("�����ڰ� �ƴմϴ�.");
				return;
			}
		}
		
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("���Ե� ���� : " + count + "��");
		
		
	}
	
}





















