package com.kh.silsub2.student.controller;

import java.util.Scanner;

import com.kh.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		Student[] srr = new Student[10];
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		boolean check = true;
		
		while(check){
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			System.out.print("�̸� : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			
			srr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			char yn = sc.next().toLowerCase().charAt(0);
			
			if(yn == 'y'){
				//check = true;
				count++;
			}else{
				check = false;
			}
		}
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		
		
		for(int i = 0; i <= count; i++){
			sumKor += srr[i].getKor();
			sumEng += srr[i].getEng();
			sumMath += srr[i].getMath();
		}
		
		System.out.println("���� ��� : " + (sumKor / (count+1)));
		System.out.println("���� ��� : " + (sumEng / (count+1)));
		System.out.println("���� ��� : " + (sumMath / (count+1)));
		System.out.println("������ ��� : " + ((sumKor + sumEng + sumMath)/ ((count+1) * 3)));
		
		

	}

}
