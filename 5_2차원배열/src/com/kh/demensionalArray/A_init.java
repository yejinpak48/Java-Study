package com.kh.demensionalArray;

public class A_init {
	public void testInit() {
		//������(2����)�迭�� ����
		//������ �ϰ� �Ǹ� stack�� ���۷��� ������ �����ȴ�.
		int[][] iarr1;
		int iarr2[][];
		
		//heap������ 2���� �迭�� �Ҵ��Ѵ�.
		//���� �迭�� ���
		iarr1 = new int[3][5];
		
		//�迭�� ���۷����� �����ϴ� �迭�� �ݵ�� ũ�⸦ ������ ��� �Ѵ�.
		/*iarr2 = new int[][];*/	//������
		/*iarr2 = new int[][5];*/	//������
		iarr2 = new int[3][];
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		//heap �������� �� �������� ������ ������ �� ���� ������
		//JVM�� ������ �ʱⰪ�� ����ִ�.
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
		//�迭�� �����ϰ� �Ҵ��� ��, �ε����� �����ؼ� ���� ����� �� �ִ�.
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
		
		//���� for���� �̿��� �� ���
		int value = 1;
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
			}
		}
		
		printArray(iarr);
	}
	
	//������ �迭�� ���޹޾� ����ϴ� ����� �����ϴ� �޼ҵ�
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
		//�����迭
		//�ڷ����� ���� 1���� �迭�� ���� �� �ϳ��� ���� ���� 2���� �迭�̱� ������
		//�����ִ� 1���� �迭�� ���̰� �� ���� �ʿ�� ����.
		int[][] iarr = new int[3][];
		
		//���۷����� �����ϴ� �迭�� �ƹ� �ּҸ� �����ϰ� ���� �ʱ� ������
		//NullPointerException �߻�!
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
		//������ �迭�� �Ҵ�� �ʱ�ȭ�� ���ÿ� �� ���� �ִ�.
		int[][] iarr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		int[][] iarr2 = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13,14}};
	
		printArray(iarr);
		printArray(iarr2);
	}
}






















