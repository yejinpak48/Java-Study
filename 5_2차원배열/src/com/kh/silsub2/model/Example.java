package com.kh.silsub2.model;

import java.util.Random;
import java.util.Scanner;

public class Example {
	public void example1(){
		// ���� ���̰� 3, ���� ���̰� 4�� ������ 2���� �迭�� �����Ͽ� 1���� 12���� 2���� �迭�� ���� �ʱ�ȭ�ϰ�
		// �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.

		int iarr[][] = new int[3][4];

		//�ʱ�ȭ
		int su = 1;

		for (int i = 0; i < iarr.length; i++){
			for (int j = 0; j < iarr[i].length; j++){
				iarr[i][j] = su++;
			}
		}

		//���
		for (int i = 0; i < iarr.length; i++){
			for (int j = 0; j < iarr[i].length; j++){
				System.out.printf("%2d ", iarr[i][j]);
			}
			System.out.println();
		}
	}

	public void example2(){
		//������ �迭�� ũ�⸦ 1~10������ �������Է¹޾� �������� ���ĺ� �ֱ�
		Scanner sc = new Scanner(System.in);
		char c = 65;
		int rnum = 0;
		int cols = 0;
		int rows = 0;

		do{
			System.out.print("���� ���� ���� �Է��ϼ��� : ");
			cols = sc.nextInt();

			if(cols < 1 || cols > 10){
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�. �ٽ� �Է��ϼ���.");
				System.out.println();
			}else{
				break;
			}

		}while(true);

		do{
			System.out.print("���� ���� ���� �Է��ϼ��� : ");
			rows = sc.nextInt();

			if(rows < 1 || rows > 10){
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�. �ٽ� �Է��ϼ���.");
				System.out.println();
			}else{
				break;
			}

		}while(true);

		char crr[][] = new char[cols][rows];

		for(int i = 0; i < crr.length; i ++){
			for(int j = 0; j < crr[i].length; j++){
				Random r = new Random();
				crr[i][j] = (char)(c + r.nextInt(26));

				System.out.print(crr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void example3(){
		// 12���� �л����� �⼮�� ������ 2�� 6������ �ڸ� ��ġ�� �Ͽ� �д��� ������, 1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� ������ ��ȣ ������ �ڸ��� ��ġ�Ͻÿ�

		String student[] = {"ȫ�浿", "�̼���", "������", "������", "�念��", "�Ӳ���", "�庸��", "���¹�", "������", "������", "������", "�̻��"};
		String part1[][] = new String[3][2];
		String part2[][] = new String[3][2];
		int ctn = 0;

		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j <part1[i].length; j++){
				part1[i][j] = student[ctn];
				ctn++;
			}
		}
		for(int i = 0; i < part2.length; i++){
			for(int j = 0; j <part2[i].length; j++){
				part2[i][j] = student[ctn];
				ctn++;
			}
		}

		System.out.println("== 1�д� ==");
		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j < part1[i].length; j++){
				System.out.print(part1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for(int i = 0; i < part2.length; i++){
			for(int j = 0; j < part2[i].length; j++){
				System.out.print(part2[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public void example4(){
		// 1������ �ڸ� ��ġ �� �л� �̸��� �Է¹ް�, �� �д� ���° �� ������/���� �ڸ����� �˻��Ͽ� ����Ͻÿ�

		String student[] = {"ȫ�浿", "�̼���", "������", "������", "�念��", "�Ӳ���", "�庸��", "���¹�", "������", "������", "������", "�̻��"};
		String part1[][] = new String[3][2];
		String part2[][] = new String[3][2];
		int ctn = 0;

		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j <part1[i].length; j++){
				part1[i][j] = student[ctn];
				ctn++;
			}
		}
		for(int i = 0; i < part2.length; i++){
			for(int j = 0; j <part2[i].length; j++){
				part2[i][j] = student[ctn];
				ctn++;
			}
		}

		System.out.println("== 1�д� ==");
		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j < part1[i].length; j++){
				System.out.print(part1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for(int i = 0; i < part2.length; i++){
			for(int j = 0; j < part2[i].length; j++){
				System.out.print(part2[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("============================");

		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		String partName = "";
		String colName = "";
		String rowName = "";

		for(int i = 0; i < part1.length; i++){
			for (int j = 0; j < part1[i].length; j++){
				if(part1[i][j].equals(name)){
					partName = "1�д�";
					if(i == 0){
						rowName = "ù ��° ��";
					}else if(i == 1){
						rowName = "�� ��° ��";
					}else{
						rowName = "�� ��° ��";
					}
					if(j == 0){
						colName = "����";
					}else{
						colName = "������";
					}

				}
			}
		}
		for(int i = 0; i < part2.length; i++){
			for (int j = 0; j < part2[i].length; j++){
				if(part2[i][j].equals(name)){
					partName = "2�д�";
					if(i == 0){
						rowName = "ù ��° ��";
					}else if(i == 1){
						rowName = "�� ��° ��";
					}else{
						rowName = "�� ��° ��";
					}
					if(j == 0){
						colName = "����";
					}else{
						colName = "������";
					}

				}
			}
		}
		System.out.println("�˻��Ͻ� " + name + " �л��� " + partName + " " + rowName + " " + colName + "�� �ֽ��ϴ�.");
	}

	public void example5(){
		// ����ǥ ���
		int arr[][] = {{80, 90, 77}, {78, 97, 86},{71, 68, 88}};
		String name = "";

		System.out.println("================= A�� ����ǥ =================");
		System.out.println("  �̸�        ����          ����          ����          �հ�            ���");
		System.out.println("-------------------------------------------");

		for(int i = 0; i < arr.length; i++){
			switch(i){
			case 0 : name = "ȫ�浿"; break;
			case 1 : name = "�̼���"; break;
			case 2 : name = "������"; break;
			}
			System.out.print(" " + name + "       ");
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]);
				if(j != arr[i].length-1){
					System.out.print("     ");
				}else{
					int sum = 0;
					float avg = 0.0f;

					for(int k = 0; k < arr[i].length; k++){
						sum += arr[i][k];
					}
					avg = (float)sum / arr[i].length;
					avg = ((float)Math.round(avg * 10))/10;
					System.out.print("    " + sum + "     " + avg);
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------");
		System.out.print("  �հ� ");
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int total = 0;
		float avg = 0.0f;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length;j++){
				if(j == 0){
					sum1 += arr[i][j];
				}
				if(j == 1){
					sum2 += arr[i][j];
				}
				if(j == 2){
					sum3 += arr[i][j];
				}
			}
		}
		total = sum1 + sum2 + sum3;
		avg = (float)total / (float)(arr.length * arr[0].length);
		avg = ((float)Math.round(avg * 10)) / 10;

		System.out.print("       " + sum1 + "    " + sum2 + "    " + sum3 + "   " + total + "     " + avg);
	}

	public void example6(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Ȧ�� �ϳ��� �Է��ϼ��� : ");
		int row = sc.nextInt();
		int col = row;

		int center = (int)row/2;
		int start = 0;
		int end = col;
		int rowstart = 0;

		String star[][] = new String[row][col];

		if(row % 2 == 1){
			for (int i = 0; i < star.length; i++) {
				for (int j = start; j < star[i].length; j++) {
					star[i][j] = " ";
				}
			}

			for (int i = 0; i < star.length; i++) {
				for (int j = start; j < end; j++) {
					star[i][j] = "*";
				}
				if(rowstart < center){
					start++;
					end--;	
					rowstart++;
				}else{
					start--;
					end++;
					rowstart++;
				}
			}


			for (int i = 0; i < star.length; i++) {
				for (int j = 0; j < star.length; j++) {
					System.out.print(star[i][j]);
				}
				System.out.println();
			}
		}else{
			System.out.println("Ȧ���� �Է��ؾ� �մϴ�.");
		}
	}
}
