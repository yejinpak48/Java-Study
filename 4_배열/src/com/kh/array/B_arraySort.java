package com.kh.array;

public class B_arraySort {
	public void testArraySort() {
		//������ �� �� �����ϱ�
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		//�迭�� �� ��ġ ����
		int[] arr = {2, 1, 3};
		
		int temp2;
		
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
	
	public void testArraySort2() {
		int[] iarr = {2,5,4,6,1,3};
		
		//��������
		/*���������̶� ���� �˰��򿡼� ���� �����ϰ� �⺻�̵Ǵ� �˰�������
		 * �迭�� ó���� ���� Ž���ϸ鼭 ������� �����ϴ� 
		 * ���� �������� �˰����̴�.
		 * */
		
		//�������� ����
		//�ε����� �� ���� ������Ű�� �ݺ���
		for(int i = 1; i < iarr.length; i++) {
			//�ε����� ������ ������ ó������ �ش� �ε��� ������ ���� ���ϴ� �ݺ���
			for(int j = 0; j < i; j++) {
				//�������� ������ ���� ó��
				//���������� ��ȣ�� �ݴ�� �ٲٸ� ��
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		for(int i = 0; i < iarr.length; i++) {
			if(i < iarr.length - 1) {
				System.out.print(iarr[i] + ", ");
			}else {
				System.out.print(iarr[i]);
			}
				
		}
	}
}




















