package com.kh.silsub5.student.controller;

import java.util.Scanner;

import com.kh.silsub5.student.mode.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("반을 입력하세요 : ");
		int classroom = sc.nextInt();
		System.out.print("이름을 입력하세요 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		
		Student s = new Student(grade, classroom, name, height, gender);
		s.information();

	}

}
