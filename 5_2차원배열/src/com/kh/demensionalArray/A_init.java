package com.kh.demensionalArray;

public class A_init {
	public void testInit() {
		//다차원(2차원)배열의 선언
		//선언을 하게 되면 stack에 레퍼런스 변수가 생성된다.
		int[][] iarr1;
		int iarr2[][];
		
		//heap영역에 2차원 배열을 할당한다.
		//정변 배열의 경우
		iarr1 = new int[3][5];
		
		//배열의 레퍼런스를 보관하는 배열은 반드시 크기를 지정해 줘야 한다.
		/*iarr2 = new int[][];*/	//에러남
		/*iarr2 = new int[][5];*/	//에러남
		iarr2 = new int[3][];
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		//heap 영역에는 빈 공간으로 영역을 생성할 수 없기 때문에
		//JVM이 지정한 초기값이 들어있다.
		/*for(int i = 0; i < iarr2.length; i++) {
			for(int j = 0; j < iarr2[i].length; j++) {
				System.out.print(iarr2[i][j]);
				
				if(j != iarr2[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			
		}*/
		printArray(iarr2);
		
		
	}
	
	public void testInit2() {
		//배열을 선언하고 할당한 뒤, 인덱스로 접근해서 값을 기록할 수 있다.
		int[][] iarr = new int[3][5];
		
		/*iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 6;
		iarr[1][1] = 7;
		iarr[1][2] = 8;
		iarr[1][3] = 9;
		iarr[1][4] = 10;
		
		iarr[2][0] = 11;
		iarr[2][1] = 12;
		iarr[2][2] = 13;
		iarr[2][3] = 14;
		iarr[2][4] = 15;*/
		
		//이중 for문을 이용한 값 기록
		int value = 1;
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
			}
		}
		
		printArray(iarr);
	}
	
	//이차원 배열을 전달받아 출력하는 기능을 제공하는 메소드
	public void printArray(int[][] iarr) {
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j]);
				
				if(j != iarr[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
	public void testInit3() {
		//가변배열
		//자료형이 같은 1차원 배열을 여러 개 하나로 묶은 것이 2차원 배열이기 때문에
		//묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.
		int[][] iarr = new int[3][];
		
		//레퍼런스를 보관하는 배열이 아무 주소를 참조하고 있지 않기 때문에
		//NullPointerException 발생!
		/*printArray(iarr);*/
		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];
		
		/*printArray(iarr);*/
		
		int value = 0;
		
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = ++value;
			}
		}
		
		printArray(iarr);
	}
	
	public void testInit4() {
		//다차원 배열의 할당과 초기화를 동시에 할 수도 있다.
		int[][] iarr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		int[][] iarr2 = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13,14}};
	
		printArray(iarr);
		printArray(iarr2);
	}
}






















