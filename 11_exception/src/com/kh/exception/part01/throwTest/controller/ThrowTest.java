package com.kh.exception.part01.throwTest.controller;

public class ThrowTest {
	
	public void methodA() throws Exception{
		System.out.println("methodA() ȣ���...");
		
		methodB();
		
		System.out.println("methodA() �����...");
	}
	
	public void methodB() throws Exception{
		System.out.println("methodB() ȣ���...");
		
		methodC();
		
		System.out.println("methodB() �����...");
	}
	
	public void methodC() throws Exception{
		System.out.println("methodC() ȣ���...");
		
		//���������� exception �߻�
		throw new Exception("���ܹ߻�!!");
		
		//���������� ������ �߻���Ű�� ������������ ����Ǳ� ������
		//�Ʒ��� ������ ������� �ʾ� ���� �߻���
		//System.out.println("methodC() �����...");
	}
	
	
	
}












