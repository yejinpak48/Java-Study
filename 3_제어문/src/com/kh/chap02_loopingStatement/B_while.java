package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class B_while {
	public void testWhile() {
		int i = 0;
		while(i <= 5) {
			System.out.println(i + "��° �ݺ��� ������...");
			i++;
		}
		
	}
	
	public void testWhile2() {
		//���ڿ��� �Է¹޾� �ε������� ���ڸ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
		
	}
	
	public void testWhile3() {
		//1���� �Է¹��� �� ������ �������� ��
		System.out.println("������ �ϳ� �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum += i;
			if(i != num) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
			i++;
		}
		System.out.println();
		System.out.println(sum);
		
	}
	
	public void testWhile4() {
		//while���� �̿��Ͽ� �������� 2�ܺ��� 9�ܱ��� ����ϼ���
		int dan = 2;
		while(dan < 10) {
			int su = 1;
			while(su < 10) {
				System.out.println(dan + " * " + su 
									+ " = " + (dan * su));
				su++;
			}
			System.out.println();
			dan++;
		}
	}
	
	public void testWhile5() {
		//�� ���� ĭ ���� �Է¹޾� ĭ ����ŭ�� '*'�� �� ����ŭ ���
		//��, �� ���� ĭ ���� ������ �� ���� �ش��ϴ� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		int r = 1;
		while(r <= row) {
			int c = 1;
			while(c <= col) {
				if(r == c) System.out.print(r);
				else System.out.print("*");
				c++;
			}
			System.out.println();
			r++;
		}
	}
	
}



















