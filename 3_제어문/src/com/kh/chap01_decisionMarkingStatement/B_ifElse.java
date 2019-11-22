package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class B_ifElse {
	//�� �� �� ���� �����ϴ� ���ǹ�����, ������ ���� ���� ������ ���
	//�����ϴ� ����� ���� �ۼ��ϴ� ��쿡 ��� �Ѵ�.
	//������ ���Ͽ� �� ���� ��� �� �� ���� ������ ������ �Ѵ�.
	
	//[ǥ����]
	//if(���ǽ�){
	//   ������ ���� ��� ������ ���� �ۼ�
	//}else{
	//   ������ ������ ��� ������ ���� �ۼ�
	//}
	
	//else���� ���ǽ��� ������� ����
	//if�� ���ǽ��� �����̸� ������ else ���� ���� �ڵ带 ������
	
	public void testIfElse() {
		//���ڸ� �ϳ� �Է¹޾� Ȧ�� ¦�� �����Ͽ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String str = "";
		
		if(num % 2 == 0) {
			str = "�Է� �Ͻ� ������ ¦���Դϴ�.";
		}else {
			str = "�Է� �Ͻ� ������ Ȧ���Դϴ�.";
		}
		
		System.out.println(str);
		
	}
	
	public void testIfElse2() {
		//���ڸ� �ϳ� �Է� �޾� ������� �������� ���
		//��, 0�̸� "0�Դϴ�"��� ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String str = "";
		
		if(num != 0) {
			if(num > 0) {
				str = "�Է��Ͻ� ���ڴ� ����Դϴ�.";
			}else {
				str = "�Է��Ͻ� ���ڴ� �����Դϴ�.";
			}
		}else {
			str = "�Է��Ͻ� ���ڴ� 0 �Դϴ�.";
		}
		
		System.out.println(str);
		
	}
	
	public void testIfElse3() {
		//���� �� ���� �Է� �޾�, �� ���� ��������� ó���ؼ� ����ϼ���
		//��, �� �� ��� 1���� 100 ������ ���̾�� ��
		//�� �� �ϳ��� ������ ������ ������
		//"���� 1���� 100 ���̾�� �մϴ�." ��µǰ� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int plus, minus, multi, div, mod;
		
		if((num1 >= 1 && num1 <= 100) 
				&& (num2 >= 1 && num2 <= 100)) {
			plus = num1 + num2;
			minus = num1 - num2;
			multi = num1 * num2;
			div = num1 / num2;
			mod = num1 % num2;
			
			System.out.println(num1 + " + " + num2 + " = " + plus);
			System.out.println(num1 + " - " + num2 + " = " + minus);
			System.out.println(num1 + " * " + num2 + " = " + multi);
			System.out.println(num1 + " / " + num2 + " = " + div);
			System.out.println(num1 + " % " + num2 + " = " + mod);
					
		}else {
			System.out.println("�� �� ��� 1���� 100 ������ ���̾�� �մϴ�.");
		}
		
		
	}
	
	
	
	
	
}















