package com.kh.chap03_branchingStatement;

import java.util.Scanner;

public class A_break {
	public void breakTest() {
		//break문은 반복문 내에서만 사용할 수 있다.
		//단, switch문에서 예외적으로 사용됨
		//일반적으로 if(조건식){break;} 사용됨
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
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













