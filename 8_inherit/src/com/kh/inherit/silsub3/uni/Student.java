package com.kh.inherit.silsub3.uni;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student(){}
	
	public Student(String name, int age, int height, int weight,
						String number, String major){
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	public void setNumber(String number){
		this.number = number;
	}
	public void setMajor(String major){
		this.major = major;
	}
	
	
	public String getNumber(){
		return number;
	}
	public String getMajor(){
		return major;
	}
	
	@Override
	public String toString(){
		return super.toString() +"\t" + this.number + "\t "+ this.major;
		
	}
}
