package com.kh.silsub1.example;

import java.util.Scanner;

public class Munjea {
	//���� 1
	public void test1(){
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int kr = scan.nextInt();
		System.out.print("���� ���� : ");
		int eng = scan.nextInt();
		System.out.print("���� ���� : ");
		int math = scan.nextInt();

		int sum = (kr + eng + math);
		double avg = sum/3.0;

		System.out.println("�հ� ���� : " + sum);
		System.out.println("��� ���� : " + avg);

		if(kr >= 40 && eng >= 40 && math >= 40 && avg >= 60){
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
		}else{
			System.out.println("���հ�");
		}				
	}			
	//���� 2
	public void test2(){
		Scanner sc = new Scanner(System.in);

		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ �Է� : ");
		int num = sc.nextInt();

		switch(num){  
		case 1 : System.out.println("�Է¸޴��� ���õǾ����ϴ�."); break;
		case 2 : System.out.println("�����޴��� ���õǾ����ϴ�."); break;
		case 3 : System.out.println("��ȸ�޴��� ���õǾ����ϴ�."); break;
		case 4 : System.out.println("�����޴��� ���õǾ����ϴ�."); break;
		case 7 : System.out.println("���α׷��� ����˴ϴ�."); break;
		default : System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�." + "\n" 
				+ "�ٽ� �Է��Ͻʽÿ�."); return;
		}
	}
	//���� 3
	public void test3(){
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		if(num > 0){
			System.out.println("�����.");
		}else{
			System.out.println("����� �ƴϴ�.");	
		}
	}
	//���� 4
	public void test4(){
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		if(num % 2 == 0){
			System.out.println("¦����.");
		}else{
			System.out.println("Ȧ����.");
		}
	}
	//���� 5
	public void test5(){
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("Ű : ");
		double height = sc.nextDouble();

		if(name.length() > 0 && name != null && age > 0 && height > 0){
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + age);
			System.out.println("Ű : " + height);
			System.out.println(name + "�� ���̴� " + age + "�̰�, Ű�� " 
					+ height + "cm �̴�.");
		}
	}
	//���� 6
	public void test6(){
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();

		if(num1 > 0 && num2 > 0){
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		}
	}
	//���� 7
	public void test7(){
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();

		char grade = ' ';

		if(score >0){
			if(score >= 90){
				grade = 'A';
			}else if(score > 80){
				grade = 'B';
			}else if(score > 70){
				grade = 'C';
			}else if(score > 60){
				grade = 'D';
			}else{
				grade = 'F';
			}
			System.out.println("���� : " + score);
			System.out.println("���� : " + grade);
		}
	}
}
