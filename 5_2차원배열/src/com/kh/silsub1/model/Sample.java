package com.kh.silsub1.model;

import java.util.Scanner;

public class Sample {
	public void munjae1(){
		int[][] iarr = new int[4][4];
		int sum = 0;
		
		//�����
		for(int i = 0; i < iarr.length-1; i++){
			for(int j = 0; j < iarr[i].length-1; j++){
				iarr[i][j] = (int)(Math.random() * 100) + 1; 
			}
		}
		//���ó��	
		for(int i = 0; i < iarr.length-1; i++){
			for(int j = 0; j < iarr[i].length-1; j++){
				iarr[i][3] += iarr[i][j];
				iarr[3][j] += iarr[i][j];
			}
			
		}
		for(int i = 0; i < iarr.length-1; i++){
			iarr[3][3] += iarr[3][i] + iarr[i][3];
		}

		
		//���Ȯ��
		for(int i = 0; i < iarr.length; i++){
			for(int j = 0; j < iarr[i].length; j++){
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void munjae2(){
		int iarr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		
		int[] sum = new int[iarr.length];
		
		for(int i = 0; i < iarr.length; i++){
			System.out.print(i + "��° 1�����迭 ÷�ڼ� : ");
			iarr[i] = new int[sc.nextInt()];
			//�� ���
			for(int j = 0; j < iarr[i].length; j++){
				iarr[i][j] = (int)(Math.random() * 100) + 1;
				sum[i] += iarr[i][j];
			}
		}
		//���Ȯ��
		for(int i = 0; i < iarr.length; i++){
			for(int j = 0; j < iarr[i].length; j++){
				System.out.print(iarr[i][j] + ", ");
			}
			System.out.println();
		}
		//�� �ະ �հ谡 5�� ����� �ุ ���
		for(int i = 0; i < sum.length; i++){
			if(sum[i] % 5 == 0){
				System.out.print(i + "�� : ");
				for(int j = 0; j < iarr[i].length; j++)
					System.out.print(iarr[i][j] + ", ");
				System.out.println("\t�հ� : " + sum[i]);
			}
		}
	}
	
}
