package com.kh.chap05_method.part01_overloadingTest;

public class TestOverloading {
	
	public int test() {
		return 0;
	}
	public int test(int a) {
		return 0;
	}
	public int test(int a, int b) {
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
	
	//���� �߻�
	//�Ű��������� ��� ���� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� �Ѵ�.
	/*public int test(int b, int a) {
		return 0;
	}*/
	
	public int test(String s, int a) {
		return 0;
	}
	public String test(int a, int b, String str) {
		return null;
	}
	//�����߻�
	//����Ÿ���� �ٸ��ٰ� �����ε��� ������� �ʴ´�.
	/*public int test(int a, int b, String str) {
		return 0;
	}*/
	
	//���� �߻�
	//���������ڰ� �ٸ��ٰ� �����ε��� ������� �ʴ´�.
	/*private String test(int a, int b, String str) {
		return "";
	}*/
	
	
}



















