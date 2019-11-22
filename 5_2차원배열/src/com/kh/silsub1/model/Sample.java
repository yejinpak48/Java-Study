package com.kh.silsub1.model;

import java.util.Scanner;

public class Sample {
	public void munjae1(){
		int[][] iarr = new int[4][4];
		int sum = 0;
		
		//값기록
		for(int i = 0; i < iarr.length-1; i++){
			for(int j = 0; j < iarr[i].length-1; j++){
				iarr[i][j] = (int)(Math.random() * 100) + 1; 
			}
		}
		//계산처리	
		for(int i = 0; i < iarr.length-1; i++){
			for(int j = 0; j < iarr[i].length-1; j++){
				iarr[i][3] += iarr[i][j];
				iarr[3][j] += iarr[i][j];
			}
			
		}
		for(int i = 0; i < iarr.length-1; i++){
			iarr[3][3] += iarr[3][i] + iarr[i][3];
		}

		
		//출력확인
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
			System.out.print(i + "번째 1차원배열 첨자수 : ");
			iarr[i] = new int[sc.nextInt()];
			//값 기록
			for(int j = 0; j < iarr[i].length; j++){
				iarr[i][j] = (int)(Math.random() * 100) + 1;
				sum[i] += iarr[i][j];
			}
		}
		//출력확인
		for(int i = 0; i < iarr.length; i++){
			for(int j = 0; j < iarr[i].length; j++){
				System.out.print(iarr[i][j] + ", ");
			}
			System.out.println();
		}
		//각 행별 합계가 5의 배수인 행만 출력
		for(int i = 0; i < sum.length; i++){
			if(sum[i] % 5 == 0){
				System.out.print(i + "행 : ");
				for(int j = 0; j < iarr[i].length; j++)
					System.out.print(iarr[i][j] + ", ");
				System.out.println("\t합계 : " + sum[i]);
			}
		}
	}
	
}
