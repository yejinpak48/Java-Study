package com.kh.variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*import java.util.Scanner;*/

public class B_Ű�����Է��׽�Ʈ {
	//java.io ��Ű������ �����Ǵ� Ŭ������ �̿��� Ű���� �Է� �׽�Ʈ
	public void inputTest1() {
		//�����
		BufferedReader br 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//println�� print�� �� �ٲ� �����̴�.
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		
		try {
			String value = br.readLine();  //���ڿ� ���·� �о����
			
			/*System.out.println("��� ��� : " + (value * 3));*/
			
			//���ڿ� ������ ���ڸ� ���� ���� �����ͷ� ��ȯ : parsing
			int number = Integer.parseInt(value);
			
			System.out.println("��� ��� : " + (number * 3));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void inputTest2() {
		//java.util ��Ű���� Scanner Ŭ���� ���
		//java 5���� ���ĺ��� �߰���
		
		//Ŭ������ fullName�� ����ϸ� import�� ���� �ʾƵ� �ȴ�.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();  //�� �ٿ� ���� ������ �о�´�.
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();    //���� ���� �о�´�.
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();  //�Ǽ��� ���� �о�´�.
		
		System.out.println(name + "����" + age + " �� �̸�, Ű�� " 
		                   + height + "cm �Դϴ�.");
		
		
	}
	
	
	public static void main(String[] args) {
		B_Ű�����Է��׽�Ʈ test = new B_Ű�����Է��׽�Ʈ();
		//test.inputTest1();
		test.inputTest2();
		
	}
}


















