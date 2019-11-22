package com.kh.chap03_branchingStatement;

public class B_continue {
	public void continueTest() {
		//continue문 : 반복문 내에서만 사용할 수 있음
		//if(조건식) {continue;}
		//continue문은 아래 내용을 더이상 실행하지 말고
		//증감식으로 건너뛰라는 의미임
		
		//1~100 까지의 정수들 합계 출력
		//단, 4의 배수는 빼고 계산
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
			System.out.println("======== " + dan + "단 =======");
			
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


















