package com.kh.collection.part05_myGenerics.controller;

//Ŭ���� ���� �� ���׸����� ������ �� �ִ�.
//���ĺ� �빮�ڷ� ���׸����� �����ϸ� ��ü ���� �� Ÿ���� �����ȴ�.
public class TestMyGenerics<T> {
	private T[] array;
	
	public TestMyGenerics(T[] array) {
		this.array = array;
	}
	public void output() {
		for(T obj : array) {
			System.out.println(obj);
		}
	}
}
