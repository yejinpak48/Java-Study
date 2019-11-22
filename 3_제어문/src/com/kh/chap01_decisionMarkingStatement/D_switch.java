package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class D_switch {
	//������ ���� case���� ã�� ����� �����ϴ� ���ǹ��̴�.
	//�ش��ϴ� ���� ���� ��쿡�� default�� ��ɹ��� �����Ѵ�.
	
	//case�� ��ɹ� ���̿��� �ݷ�(:)�� ��� �Ѵ�.
	//break�� ������ ������ �ʰ� ��� �����Ѵ�.
	
	//[ǥ����]
	//switch(����) {
	//   case 1 : ���๮1; break;		//���� ���� 1�� ��� ����
	//   case 2 : ���๮2; break;		//���� ���� 2�� ��� ����
	//   case 3 : ���๮3; return;	//���� ���� case���� ���� ��� ����
	//}
	
	public void testSwitch() {
		//���� �� ���� �����ȣ 1���� �Է¹޾Ƽ�
		//�����ȣ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° �� : ");
		int second = sc.nextInt();
		System.out.print("������(+,-,*,/) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
			case '+' : result = first + second; break;
			case '-' : result = first - second; break;
			case '*' : result = first * second; break;
			case '/' : result = first / second; break;
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
		
	}
	
	public void testSwitch2() {
		//1��~ 12�������� ������ �Է¹޾�
		//�ش��ϴ� ���� ���� �������� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12�� ���� �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
			case 12 : System.out.println("�Է��Ͻ� ���� 31�� �����Դϴ�."); break;
				
			case 4 : case 6 : case 9 :
			case 11 : System.out.println("�Է��Ͻ� ���� 30�� �����Դϴ�."); break;
				
			case 2 : System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�� �����Դϴ�."); break;
			default : System.out.println("�ݵ�� 1��~12�� ������ �Է��ؾ� �մϴ�."); return;
		}
		
	}
	
	
	
}






















