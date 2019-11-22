package com.kh.silsub3.member.model.vo;

public class Member {
	//회원 정보 클래스의 멤버변수
		private String id;
		private String name;
		private String password;
		private String email;
		private char gender;
		private int age;
		
		//디폴트 생성자
		public Member(){}
		
		//매개변수 있는 생성자
		public Member(String id, String name, String password, String email,
						char gender, int age){
			this.id = id;
			this.name = name;
			this.password = password;
			this.email = email;
			this.gender = gender;
			this.age = age;
		}
		
		//setter
		public void setId(String id){
			this.id = id;
		}
		public void setName(String name){
			this.name = name;
		}
		public void setPassword(String password){
			this.password = password;
		}
		public void setEmail(String email){
			this.email = email;
		}
		public void setGender(char gender){
			this.gender = gender;
		}
		public void setAge(int age){
			this.age = age;
		}
		
		//getter
		public String getId(){
			return this.id;
		}
		public String getName(){
			return this.name;
		}
		public String getPassword(){
			return this.password;
		}
		public String getEmail(){
			return this.email;
		}
		public char getGender(){
			return this.gender;
		}
		public int getAge(){
			return this.age;
		}
		
		//문자열 합치기 메소드
		public String memberInfo(){
			return id + ", " + name + ", " + password + ", " + email + ", " + 
					gender + ", " + age;
		}
}
