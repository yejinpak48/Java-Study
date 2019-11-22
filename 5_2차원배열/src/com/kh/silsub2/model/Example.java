package com.kh.silsub2.model;

import java.util.Random;
import java.util.Scanner;

public class Example {
	public void example1(){
		// 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언하여 1부터 12까지 2차원 배열에 값을 초기화하고
		// 그 값을 출력하는 코드를 작성하시오.

		int iarr[][] = new int[3][4];

		//초기화
		int su = 1;

		for (int i = 0; i < iarr.length; i++){
			for (int j = 0; j < iarr[i].length; j++){
				iarr[i][j] = su++;
			}
		}

		//출력
		for (int i = 0; i < iarr.length; i++){
			for (int j = 0; j < iarr[i].length; j++){
				System.out.printf("%2d ", iarr[i][j]);
			}
			System.out.println();
		}
	}

	public void example2(){
		//이차원 배열의 크기를 1~10까지의 정수로입력받아 랜덤으로 알파벳 넣기
		Scanner sc = new Scanner(System.in);
		char c = 65;
		int rnum = 0;
		int cols = 0;
		int rows = 0;

		do{
			System.out.print("가로 행의 수를 입력하세요 : ");
			cols = sc.nextInt();

			if(cols < 1 || cols > 10){
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
				System.out.println();
			}else{
				break;
			}

		}while(true);

		do{
			System.out.print("세로 열의 수를 입력하세요 : ");
			rows = sc.nextInt();

			if(rows < 1 || rows > 10){
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
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
		// 12명의 학생들을 출석부 순으로 2열 6행으로 자리 배치를 하여 분단을 나누고, 1분단 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하시오

		String student[] = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
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

		System.out.println("== 1분단 ==");
		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j < part1[i].length; j++){
				System.out.print(part1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for(int i = 0; i < part2.length; i++){
			for(int j = 0; j < part2[i].length; j++){
				System.out.print(part2[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public void example4(){
		// 1번문제 자리 배치 후 학생 이름을 입력받고, 몇 분단 몇번째 줄 오른쪽/왼쪽 자리인지 검색하여 출력하시오

		String student[] = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
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

		System.out.println("== 1분단 ==");
		for(int i = 0; i < part1.length; i++){
			for(int j = 0; j < part1[i].length; j++){
				System.out.print(part1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for(int i = 0; i < part2.length; i++){
			for(int j = 0; j < part2[i].length; j++){
				System.out.print(part2[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("============================");

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String partName = "";
		String colName = "";
		String rowName = "";

		for(int i = 0; i < part1.length; i++){
			for (int j = 0; j < part1[i].length; j++){
				if(part1[i][j].equals(name)){
					partName = "1분단";
					if(i == 0){
						rowName = "첫 번째 줄";
					}else if(i == 1){
						rowName = "두 번째 줄";
					}else{
						rowName = "세 번째 줄";
					}
					if(j == 0){
						colName = "왼쪽";
					}else{
						colName = "오른쪽";
					}

				}
			}
		}
		for(int i = 0; i < part2.length; i++){
			for (int j = 0; j < part2[i].length; j++){
				if(part2[i][j].equals(name)){
					partName = "2분단";
					if(i == 0){
						rowName = "첫 번째 줄";
					}else if(i == 1){
						rowName = "두 번째 줄";
					}else{
						rowName = "세 번째 줄";
					}
					if(j == 0){
						colName = "왼쪽";
					}else{
						colName = "오른쪽";
					}

				}
			}
		}
		System.out.println("검색하신 " + name + " 학생은 " + partName + " " + rowName + " " + colName + "에 있습니다.");
	}

	public void example5(){
		// 성적표 출력
		int arr[][] = {{80, 90, 77}, {78, 97, 86},{71, 68, 88}};
		String name = "";

		System.out.println("================= A반 성적표 =================");
		System.out.println("  이름        국어          영어          수학          합계            평균");
		System.out.println("-------------------------------------------");

		for(int i = 0; i < arr.length; i++){
			switch(i){
			case 0 : name = "홍길동"; break;
			case 1 : name = "이순신"; break;
			case 2 : name = "유관순"; break;
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
		System.out.print("  합계 ");
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
		System.out.print("홀수 하나를 입력하세요 : ");
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
			System.out.println("홀수만 입력해야 합니다.");
		}
	}
}
