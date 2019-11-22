package com.kh.chap02_loopingStatement;

import java.util.Scanner;

public class A_for {
	public void testFor() {
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(i + "��° �ݺ��� ������...");
		}
		
	}
	
	public void testFor2() {
		//������ �ϳ� �Է� �޾� �� ���� ����� ���� �� ���� �������� ����ϰ� �ϰ�,
		//����� �ƴϸ� "�ݵ�� 1~9 ������ ����� �Է��Ͽ��� �մϴ�" ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~9������ ����� �ϳ� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		if(dan > 0 && dan < 10) {
			/*System.out.println(dan + " * " + 1 + " = " + (dan * 1));
			System.out.println(dan + " * " + 2 + " = " + (dan * 2));
			System.out.println(dan + " * " + 3 + " = " + (dan * 3));
			System.out.println(dan + " * " + 4 + " = " + (dan * 4));
			System.out.println(dan + " * " + 5 + " = " + (dan * 5));
			System.out.println(dan + " * " + 6 + " = " + (dan * 6));
			System.out.println(dan + " * " + 7 + " = " + (dan * 7));
			System.out.println(dan + " * " + 8 + " = " + (dan * 8));
			System.out.println(dan + " * " + 9 + " = " + (dan * 9));*/
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		}else {
			System.out.println("�ݵ�� 1~9 ������ ����� �Է��ؾ� �մϴ�.");
		}
		
	}
	
	public void testFor3() {
		//1���� 100 ������ ������ ���������� �������� �հ踦 ���Ͽ� ���
		int random = (int)(Math.random() * 100) + 1;
		
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + random + "���� �������� �հ� : " + sum);
		
		
	}
	
	public void testFor4() {
		//���� �� ���� �Է� �޾� ���������� ū �������� �հ踦 ���Ͽ� ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		int max, min;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "���� " + max + "������ �������� �հ� : " + sum);
		
	}
	
	public void testFor5() {
		//for�� �ȿ� for���� ����� �� �ִ�.
		//�� : ������ 2�ܺ��� 9�ܱ��� ���
		
		//��ü�� �ݺ��ϴ� for��
		for(int dan = 2; dan < 10; dan++) {
			//������ �� ���� ����ϴ� for��
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su 
										+ " = " + (dan * su));
			}
			System.out.println();
			
		}
		
		
		
	}
	
	public void testFor6() {
		//�Ƴ��α� �ð� ���
		for(int hour = 0; hour < 12; hour++) {
			for(int min = 0; min < 60; min++) {
				System.out.println(hour + "�� " + min + "��");
			}
		}
	}
	
	public void testFor7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int c = 1; c <= 5; c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void testFor8() {
		//�� �ٿ� ��ǥ ���ڸ� �Է��� �� ���� ĭ ����ŭ �Է�
		//��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*
		 * 1*****
		 * *2****
		 * **3***
		 * ***4**
		 * ****5*
		 * *****6
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		for(int r = 1; r <= row; r++) {
			for(int c = 1; c <= col; c++) {
				if(r == c) {
					System.out.print(r);
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	
}
















