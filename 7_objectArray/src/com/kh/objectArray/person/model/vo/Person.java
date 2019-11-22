package com.kh.objectArray.person.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, char gender,
					double height, double weight) {
		this(name, age);	//반드시 첫 줄에 기입해야 함
		/*this.name = name;
		this.age = age;*/
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	public Person(Person p) {		//복사생성자 : 깊은복사용
		//다른 객체가 가진 값을 새 객체에 복사함
		this.name = p.name;
		this.age = p.age;
		this.gender = p.gender;
		this.height = p.height;
		this.weight = p.weight;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
	//출력용 메소드
	/*public void showPersonInfo() {
		System.out.println(this.name + ", " + this.age + ", "
				     + this.gender + ", " + this.height + ", "
				     + this.weight);
	}*/
	public String showPersonInfo() {
		return this.name + ", " + this.age + ", " + this.gender
				+ ", " + this.height + ", " + this.weight;
	}
}























