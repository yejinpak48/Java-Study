package com.kh.chap03_branchingStatement;

import java.util.Scanner;

public class A_break {
	public void breakTest() {
		//break���� �ݺ��� �������� ����� �� �ִ�.
		//��, switch������ ���������� ����
		//�Ϲ������� if(���ǽ�){break;} ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; ; i++) {
			sum += i;
			
			if(i == num) {
				break;
			}
		}
		
		
	}
}













