package com.kh.chap00_beforeTest;

import java.util.Scanner;

public class ScannerTest {
	//java.util.Scanner Ŭ������ next(), nextLine() �׽�Ʈ
	//next() : ������ ���� ���ӵ� ���ڿ��� �� �Է½� ���
	//nextLine() : ������ ���Ե� ���ڿ��� �� �Է½� ���
	public void testScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.next();
		
		System.out.println("str : " + str);
		
		//������ �� �� �б�(��, ���� ����)
		sc.nextLine();
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		
		System.out.print("������ �ִ� ���ڿ��� �Է��ϼ��� : ");
		//���� ���� �״�� ���� �ֱ� ������ ���� ���⸦ �ؾ� �Ѵ�.
		sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println("str2 : " + str2);
		
		
	}

	public static void main(String[] args) {
		new ScannerTest().testScanner();

	}

}















