package com.kh.collection.part05_myGenerics.controller;

//클래스 선언 시 제네릭스를 지정할 수 있다.
//알파벳 대문자로 제네릭스를 지정하면 객체 생성 시 타입이 결정된다.
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
