package com.kh.silsub1.student.controller;

import java.util.Scanner;

import com.kh.silsub1.student.model.vo.Student;

public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	private Student[] students = new Student[3];
	
	public void insertStudentData(){
		
		for(int i = 0; i < students.length; i++){
			System.out.print("�г� �Է� : ");
			int grade = sc.nextInt();
			System.out.print("�� �Է� : ");
			int classroom = sc.nextInt();
			System.out.print("��ȣ �Է� : ");
			int stdNo = sc.nextInt();
			System.out.print("�̸� �Է� : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			 
			students[i] = new Student(grade, classroom, stdNo, name);
		}
		
		
	}
	
	public void printStudentData(){
		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].information());
		}
	}
}
