package com.kh.chap03_branchingStatement;

public class B_continue {
	public void continueTest() {
		//continue�� : �ݺ��� �������� ����� �� ����
		//if(���ǽ�) {continue;}
		//continue���� �Ʒ� ������ ���̻� �������� ����
		//���������� �ǳʶٶ�� �ǹ���
		
		//1~100 ������ ������ �հ� ���
		//��, 4�� ����� ���� ���
		int sum = 0;
		
		for(int i = 0; i < 101; i++) {
			if(i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	public void continueTest2() {
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("======== " + dan + "�� =======");
			
			for(int su = 1; su < 10; su++) {
				if(dan % 2 == 0 || su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " * " + su + " = " 
													+ dan * su);
				
			}
			System.out.println();
			
		}
	}
}


















