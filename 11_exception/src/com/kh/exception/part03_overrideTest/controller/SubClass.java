package com.kh.exception.part03_overrideTest.controller;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass{
	
	//���� ���ܸ� �����ִ� �������� �������̵� �ؾ� �Ѵ�.
	/*@Override
	public void method() throws IOException{}*/
	
	//�θ��� ����ó�� Ŭ�������� ������ ���ܷδ� �ļ�Ŭ�������� �������̵� �� �� ����.
	/*@Override
	public void method() throws Exception() {}*/
	
	//�θ��� ����ó�� Ŭ�������� �� ������ �ִ�(��, �� ��ü���� ���ܻ�Ȳ)�� ���
	//�������̵��� �� �� �ִ�.
	@Override
	public void method() throws FileNotFoundException {}
	
	
	
}













