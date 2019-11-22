package com.kh.inherit.silsub3.uni;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human(){}
	
	public Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		return this.name + "\t" + this.age + "\t" + this.height + "\t" 
					+ this.weight;

	}
}
