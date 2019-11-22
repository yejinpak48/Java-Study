package com.kh.silsub2.example;

import java.util.Scanner;

public class Exercise {
	public void exercise1(){
		// 1~10 ������ ���� �Ѱ��� �Է¹޾� Ȧ������ ¦������ ���� Ȯ���ϰ�,Ȧ���̸� "Ȧ����.", �Ҽ��� �ƴϸ� "¦����." ���
		// ��, 1~10 ������ ������ �ƴ� ��� "�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�." ���

		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 ������ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		if(num > 0 && num <= 10){
			if(num % 2 == 0){
				System.out.println("¦����.");
			}else{
				System.out.println("Ȧ����.");
			}
		}else{
			System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
		}
	}

	public void exercise2(){
		// BMI(��ü��������)�� ����ϰ�, ���� ���� ���� ��ü��(20 �̸�), 
		// ����ü��(20�̻� 25�̸�), ������(25�̻� 30�̸�), ��(30�̻�)�� ����Ͻÿ�.
		// ��, BMI ��� ����� ü��(kg) / (����(m) * ����(m)) �̴�.
		// ���� BMI = 67 / (1.7 * 1.7)
		Scanner sc = new Scanner(System.in);

		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		float height = sc.nextFloat() / 100;
		System.out.print("�����Ը� �Է��ϼ���(Kg) : ");
		float weight = sc.nextFloat();

		float bmi = weight / (height * height);

		if(bmi < 20){
			System.out.println("����� ��ü�� �Դϴ�.");
		}else if(bmi < 25){
			System.out.println("����� ����ü�� �Դϴ�.");
		}else if(bmi < 30){
			System.out.println("����� ��ü�� �Դϴ�.");
		}else{
			System.out.println("����� ���Դϴ�.");
		}
	}

	public void exercise3(){
		// �� ���� ������ �Է¹ް�, �����ȣ(+, -, *, /, %)�� �Է¹޾� �ش� ������ ���� ����� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		System.out.print("�����ȣ�� �Է��ϼ��� : ");
		char op = sc.next().charAt(0);

		switch(op){
			case '+' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 + num2); break;
			case '-' : System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2)); break;
			case '*' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 * num2); break;
			case '/' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 / num2); break;
			case '%' : System.out.println(num1 + " " + op + " " + num2 + " = " + num1 % num2); break;
			default : System.out.println("�Է��Ͻ� ������ �����ϴ�. ���α׷��� �����մϴ�."); break;
		}
	}

	public void exercise4(){
		// ���� �̸�("���", "�ٳ���", "������", "Ű��")�� �Է��ϸ� �ش��ϴ� ���ݿ� �°� ��ǰ��� ������ ��µǰ� �Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		String product = sc.nextLine();
		int price = 0;

		switch(product){
		case "���" : price = 1000;  break;
		case "�ٳ���" : price = 3000;  break;
		case "������" : price = 2000;  break;
		case "Ű��" : price = 5000;  break;
		default : System.out.println("�غ�� ��ǰ�� �����ϴ�."); break;

		}
		System.out.println(product + "�� ������ " + price + "�� �Դϴ�.");
		
	}
	
	public void exercise5(){
		//����, ����, ���� ������ �Է¹޾� 
		// ��� ������ 60�� �̻��̸鼭 �� ������ 40�� �̻��� ������ �����ϸ� "�հ��Դϴ�"���,
		// ������� �̴��� ��� "������� �̴޷� ���հ��Դϴ�." ���
		// ����� ���� ������ �ִ� ��� "xx ������ ���� �̴޷� ���հ� �Դϴ�." ���

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();

		int avg = (kor + eng + math) / 3;

		if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40){
			System.out.println("�հ��Դϴ�!");
		}else{
			if(avg < 60){
				System.out.println("������� �̴޷� ���հ� �Դϴ�.");
			}
			
			if(kor < 40){
				System.out.println("�������� �̴޷� ���հ� �Դϴ�.");
			}
			
			if(eng < 40){
				System.out.println("�������� �̴޷� ���հ� �Դϴ�");
			}
			
			if(math < 40){
				System.out.println("�������� �̴޷� ���հ� �Դϴ�");
			}
		}
	}
	
	public void exercise6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �޿� �Է� : ");
		int salary = sc.nextInt() ;
		
		System.out.print("�� ����� �Է� : ");
		int income = sc.nextInt();
		
		double bonusRate = 0;
		int totalSalary = 0;
		
		if(income >= 50000000){
			bonusRate = 0.05;
		}else if(income >= 30000000){
			bonusRate = 0.03;
		}else if(income >= 10000000){
			bonusRate = 0.01;
		}else{
			bonusRate = 0;
		}
		
		totalSalary = salary + (int)(income * bonusRate);
		System.out.println("======================");
		System.out.println("����� : " + income);
		System.out.println("������ : " + bonusRate + "%");
		System.out.println("�� �޿� : " + salary);
		System.out.println("���ʽ� �ݾ� : " + (int)(bonusRate * income));
		System.out.println("======================");
		System.out.println("�� �޿� : " + totalSalary);
	}
}
