package com.kh.argument;

public class TestMainArgument {

	public static void main(String[] args) {
		//args�� �� ���� Ȯ�� �׽�Ʈ
		System.out.println("���ް� ���� : " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(i + "��° �� : " + args[i]);
		}
	}

}
