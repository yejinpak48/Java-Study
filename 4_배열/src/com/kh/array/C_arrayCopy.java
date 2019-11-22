package com.kh.array;

public class C_arrayCopy {
	public void shallowCopy() {
		//���� ����� �迭�� �ּҸ� �����Ѵ�.
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		
		System.out.println("originArr : " + str);
		
		str = "";
		
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
			
		}
		System.out.println("copyArr : " + str);
		
		//���� �迭�� 0��° �ε����� 99�� ����
		originArr[0] = 99;
		
		str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("���� �� originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i] + ", ";
			}
		}
		System.out.println("���� �� copyArr : " + str);
		
		System.out.println("originArr�� hashCode : " + originArr.hashCode());
		System.out.println("copyArr�� hashCode : " + copyArr.hashCode());
	}
	public void deepCopy() {
		//���� ����� ������ ���ο� �迭�� �ϳ� �����ϰ� ���� �����ϴ� ���̴�.
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		//for���� �̿��Ͽ� ���� 1:1�� �����Ѵ�.
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		originArr[0] = 99;
		
		str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("���� �� originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("���� �� copyArr : " + str);
		
		System.out.println("originArr�� hashCode : " + originArr.hashCode());
		System.out.println("copyArr�� hashCode : " + copyArr.hashCode());
		
	}
	public void deepCopy2() {
		//arraycopy()�� �̿��� �迭 ����
		//���� �迭�� ���� �ε����� ���纻 �迭�� ���� �ε����� �ٸ��� �� ���� �ִ�.
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(�����迭, ���縦�������ε���, �����ҹ迭, ���縦�������ε���, �����ұ���);
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		//�迭�� ���
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		System.out.println("originArr�� hashCode : " + originArr.hashCode());
		System.out.println("copyArr�� hashCode : " + copyArr.hashCode());
		
	}
	public void deepCopy3() {
		//clone()�� �̿��� ����
		//���� �ε����� ������ �� ������, 
		//���� �迭�� ��°�� ������ ���ο� �迭�� �Ҵ��Ѵ�.
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr�� hashCode : " + originArr.hashCode());
		System.out.println("copyArr�� hashCode : " + copyArr.hashCode());
		
		//���纻 �迭�� �̸� �Ҵ��� �Ǿ� �ִ� ���
		//���� �迭�� ������ ������ ���ο� �迭�� �����Ѵ�.
		copyArr = originArr.clone();
		
		System.out.println("copyArr�� hashCode : " + copyArr.hashCode());
		
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
	
	
	
	}
}


























