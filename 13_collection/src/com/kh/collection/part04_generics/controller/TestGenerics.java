package com.kh.collection.part04_generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestGenerics {
	public void testGenerics() {
		List list = new ArrayList();
		
		list.add(new String("Object saved"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("저장된 객체 수 : " + list.size());
		System.out.println("list : " + list);
		
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			
			if(obj instanceof Book) {
				((Book) obj).printBook();
			}
			if(obj instanceof Student) {
				((Student) obj).score();
			}
			if(obj instanceof Car) {
				((Car) obj).printCar();
			}
		}
	}
	
	public void testGenerics2() {
		//제네릭스 : 컬렉션에 저장되는 객체의 자료형에 제한을 걸 수 있다.
		ArrayList<Book> list = new ArrayList<Book>();
		
		/*list.add("test generics");*/
		list.add(new Book());
		list.add(new Book());
		
		for(Book b : list) {
			b.printBook();
		}
		
		
	}
	
	public void testGenerics3() {
		HashMap<String, Book> map = new HashMap<String, Book>();
		
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		map.put("three", new Book("jdbc"));
		
		System.out.println(map);
		
	}

}

class Book{
	private String title;
	
	public Book() {}
	
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call...");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	public Student() {}
	
	public void score() {
		System.out.println("score() call...");
	}
	@Override
	public String toString() {
		return "Student";
	}
}

class Car {
	public Car() {}
	
	public void printCar() {
		System.out.println("printCar() call..");
	}
	@Override
	public String toString() {
		return "Car";
	}
}















