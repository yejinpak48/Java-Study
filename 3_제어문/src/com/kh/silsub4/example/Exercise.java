package com.kh.silsub4.example;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
	public void exercise1() {
		//�Է� ���� ���� ������ ¦������ ���� ���ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println("1���� " + num + "���� ¦���� ���� " + sum + "�Դϴ�.");
		
	}
	public void exercise2() {
		//1�� ���� while�� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		while(i <= num) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("1���� " + num + "���� ¦���� ���� " + sum + "�Դϴ�.");
	}
	
	public void exercise3() {
		//���ڼ���
		
		String str1 = "��";
		String str2 = "��";
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				result += str1;
			}else {
				result += str2;
			}
		}
		System.out.println(result);
	}
	public void exercise4() {
		//�Ƶ����� �ֹ��ޱ�
		Scanner sc = new Scanner(System.in);
		String product = "";
		int price = 0;
		
		String order = "";
		int total = 0;
		
		do {
			System.out.println("============ Menu =============");
			System.out.println("------------ ���ŷ� -------------");
			System.out.println("1. ������ �����̽� ġŲ���� ---- 5,500��");
			System.out.println("2. ��� ------------------ 5,000��");
			System.out.println("3. ������ �丶�� �𷰽� ------- 6,000��");
			System.out.println("------------- ���� ---------------");
			System.out.println("4. �ݶ� ------------------ 1,500��");
			System.out.println("5. ���̴� ----------------- 1,500��");
			System.out.println("6. �������꽺 -------------- 2,000��");
			System.out.println("7. Ŀ�� ------------------ 1,000��");
			System.out.println("------------- ���̵� --------------");
			System.out.println("8. ����Ƣ�� ----------------- 700��");
			System.out.println("9. ���̽�ũ�� --------------- 1,000��");
			System.out.println("=================================");
			System.out.print("�ֹ��Ͻ� �޴��� ��ȣ�� �Է��ϼ��� :");
			int no = sc.nextInt();
			System.out.print("�ֹ��Ͻ� ������ �Է��ϼ��� : ");
			int ctn = sc.nextInt();
			sc.nextLine();
			System.out.print("�߰� �ֹ� �Ͻðڽ��ϱ�?(y/n)");
			String con = sc.nextLine().toUpperCase();
			
			switch(no) {
			case 1 : product = "������ �����̽� ġŲ����"; price = 5500; break;
			case 2 : product = "���"; price = 5000; break;
			case 3 : product = "������ �丶�� �𷰽�"; price = 6000; break;
			case 4 : product = "�ݶ�"; price = 1500; break;
			case 5 : product = "���̴�"; price = 1500; break;
			case 6 : product = "�������꽺"; price = 2000; break;
			case 7 : product = "Ŀ��"; price = 1000; break;
			case 8 : product = "����Ƣ��"; price = 700; break;
			case 9 : product = "���̽�ũ��"; price = 1000; break;
			}
			
			order += product + " - " + ctn + "�� : " + (price * ctn) + "��";
			total += (price * ctn);
			
			switch(con) {
			case "Y" : order += "\n"; break;
			case "N" : System.out.println("=======================");
			           System.out.println(order);
			           System.out.println("=======================");
			           System.out.println("total price : " + total + "��");
			           return;
			}
			
			
		}while(true);
				
		
		
	}
	
	public void exercise5() {
		Scanner sc = new Scanner(System.in);
		int random = new Random().nextInt(100) + 1;
		int ctn = 1;
		
		do {
			System.out.print("������ �Է��ϼ��� : ");
			int input = sc.nextInt();
			
			if(input > random) {
				System.out.println("�Է��� �������� �۽��ϴ�.");
				ctn++;
			}else if(input < random) {
				System.out.println("�Է��� �������� Ů�ϴ�.");
				ctn++;
			}else {
				System.out.println("�����Դϴ�. " + ctn 
								+ "ȸ ���� ������ ���߼̽��ϴ�.");
				break;
			}
			
		}while(true);
	}
	
	public void exercise6() {
		do {
			System.out.print("2���� ū ������ �ϳ� �Է��ϼ��� : ");
			int num = new java.util.Scanner(System.in).nextInt();
			boolean check = true;
			
			if(num < 1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}else {
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						check = false;
						break;
					}
				}
				System.out.println(check?"�Ҽ���":"�Ҽ��� �ƴϴ�.");
				break;
			}
			
		}while(true);
		
	}
	
	public void exercise7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String s = sc.nextLine();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = "";
		int mod = num % 26;
		
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			
			if(temp != ' ') {
				if(temp <= 'z' && temp >= 'a') {
					if(temp + mod > 'z') {
						result += (char)(temp + mod - 26);
					}else {
						result += (char)(temp + mod);
					}
				}else {
					if(temp + mod > 'Z') {
						result += (char)(temp + mod - 26);
					}else {
						result += (char)(temp + mod);
					}
				}
			}else {
				result += temp;
			}
		}
		System.out.println(result);
	}
	public void exercise8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		System.out.print("��ǰ ������ �Է��ϼ��� : ");
		int price = sc.nextInt();
		
		int change = money - price;
		int currency = 50000;
		int mok = 0;
		int nmg = 0;
		int sw = 0;
		int temp = change;
		
		System.out.println("================");
		while(true) {
			mok = temp / currency;
			nmg = temp % currency;
			
			if(mok == 0 && nmg == 0) {
				break;
			}
			
			if(mok != 0) {
				if(currency > 500) {
					System.out.println(currency + "���� ���� " + mok + "��");
				}else {
					System.out.println(currency + "���� ���� " + mok + "��");
				}
			}
			
			if(sw == 0) {
				currency /= 5;
				sw = 1;
			}else {
				currency /= 2;
				sw = 0;
			}
			temp = nmg;
		}
		System.out.println("==================");
		System.out.println("�Ž����� : " + change + "��");
	}
	
}




















