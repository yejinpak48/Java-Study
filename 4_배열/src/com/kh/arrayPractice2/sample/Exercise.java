package com.kh.arrayPractice2.sample;

import java.util.Scanner;

public class Exercise {
	public void test1() {
		int[] iarr = new int[10];
		
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = i + 1;
		}
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}
	public void test2() {
		String sarr[] = {"����", "�ٳ���", "������", "Ű��", "���"};
		
		System.out.println(sarr[1]);
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �ϳ� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
		char c = sc.next().charAt(0);
		int count = 0;
		
		/*char carr[] = new char[str.length()];
		
		for(int i = 0; i < carr.length; i++) {
			carr[i] = str.charAt(i);
		}*/
		
		char[] carr = str.toCharArray();
		
		for(int i = 0; i < carr.length; i++) {
			if(carr[i] == c) {
				count++;
			}
		}
		System.out.println("�Է��Ͻ� ���ڿ� : " + str + "���� ã���ô� ���� "
				         + c + "�� " + count + "�� �Դϴ�.");
		
		
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		char crr[] = str.toCharArray();
		char crr2[] = crr.clone();
		
		for(int i = 0; i < crr2.length; i++) {
			if(i >= 8) {
				crr2[i] = '*';
			}
			System.out.print(crr2[i]);
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȧ���� ���� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1 && num > 0) {
			int iarr[] = new int[num];
			int mid = num / 2;
			int ctn = 0;
			
			for(int i = 0; i <= mid; i++) {
				iarr[i] = ++ctn;
			}
			for(int i = mid + 1; i < iarr.length; i++) {
				iarr[i] = --ctn;
			}
			for(int i = 0; i < iarr.length; i++) {
				System.out.println(iarr[i] + " ");
			}
			
		
		}else {
			System.out.println("��� Ȥ�� Ȧ���� �Է��ؾ� �մϴ�.");
		}
		
	}
	
	public void test6() {
		//�ζ� ��ȣ ����(�ߺ�����, �������� ����)
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		int lottoAsc[] = lotto.clone();
		
		for(int i = 0; i < lottoAsc.length; i++) {
			for(int j = 0; j < lottoAsc.length; j++) {
				if(lottoAsc[i] < lottoAsc[j]) {
					int temp;
					temp = lottoAsc[i];
					lottoAsc[i] = lottoAsc[j];
					lottoAsc[j] = temp;
				}
			}
		}
		for(int i = 0; i < lottoAsc.length; i++) {
			System.out.println(lottoAsc[i] + " ");
		}
		
		
	}
}























