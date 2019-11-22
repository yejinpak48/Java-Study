package com.kh.api.part01_string.controller;

import java.util.StringTokenizer;

public class StringTestManager {
	
	public void stringTest() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		
		System.out.println("s1�� s2�� �ּҰ� ������ �� : " + (s1 == s2));
		System.out.println("s1�� s3�� �ּҰ� ������ �� : " + (s1 == s3));
		
		//���� ���ϱ� ���� String Ŭ������ ObjectŬ������ equeals()�޼ҵ带
		//�������̵� �� ���Ҵ�.
		System.out.println("s1�� s2�� ���� ������ �� : " + (s1.equals(s2)));
		System.out.println("s1�� s3�� ���� ������ �� : " + (s1.equals(s3)));
		
		//StringŬ���������� ObjectŬ������ hashCode�� �������̵� �� ���Ҵ�.
		//���ڿ��� ������ ������ �ؽ��ڵ带 �����ϰ� �ۼ��Ͽ���
		//���ü�� ���ϰ�ü ����� �ϱ� ����
		System.out.println("s1�� hashCode : " + s1.hashCode());
		System.out.println("s2�� hashCode : " + s2.hashCode());
		/*System.out.println("s3�� hashCode : " + s3.hashCode());*/
		
		s2 += "oracle";
		
		System.out.println("s1�� �ؽ��ڵ� : " + s1.hashCode());
		System.out.println("s2�� �ؽ��ڵ� : " + s2.hashCode());
		
		System.out.println("s1�� �ּҰ��� s2�� �񱳰��� ���� �Ŀ��� ������ �� : " 
											+ (s1 == s2));
	}
	
	public void stringBuilderTest() {
		//StringBuilder�� ���ڿ��� �����ϱ� ���� ��ü�̴�.
		//���ڿ� ����ҿ� �����ϴ� ���� �ƴ� ��ü�� ���� ������ �Ѵ�.
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb�� �� : " + sb);
		System.out.println("sb�� hashCode : " + sb.hashCode());
		
		//���� ���ڿ��� ���ڿ��� �߰��ϴ� �޼ҵ�
		sb.append("oracle");
		System.out.println("sb�� �� : " + sb);
		
		//���� ����Ǵ� ���ڿ��� ��� String���� StringBuilder�� �� ȿ�����̴�.
		System.out.println("sb�� hashCode : " + sb.hashCode());
	}
	
	public void splitTest() {
		String str = "java,oracle,JDBC,HTML5,CSS3";
		
		String[] split = str.split(",");
		
		System.out.println("�и��� ���ڿ� ���� split : " + split.length);
		
		/*for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}*/
		
		//�迭 �Ǵ� �÷��� ���� ���� for���� ����� �� �ִ�.
		for(String s : split) {
			System.out.println(s);
		}
		
		//�и��� ���ڿ��� String�迭�� ó���ϰ� ���� ���� split�� ����ϸ� �ǰ�,
		//�и��� ���ڿ��� ��ü�� ����ϱ� ���ؼ��� StringTokenizer Ŭ������
		//����Ͽ� �и��Ѵ�.
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и��� ���ڿ��� ���� stn : " + stn.countTokens());
	
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		System.out.println("���� ���� �� ���ڿ��� ���� stn : " + stn.countTokens());
	
	}
}



















