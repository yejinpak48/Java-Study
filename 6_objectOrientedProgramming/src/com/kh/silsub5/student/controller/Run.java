package com.kh.silsub5.student.controller;

import java.util.Scanner;

import com.kh.silsub5.student.mode.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г��� �Է��ϼ��� : ");
		int grade = sc.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int classroom = sc.nextInt();
		System.out.print("�̸��� �Է��ϼ��� : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		System.out.print("������ �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		
		Student s = new Student(grade, classroom, name, height, gender);
		s.information();

	}

}
