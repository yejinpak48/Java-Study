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
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			System.out.print("이름 : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			srr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.print("계속 입력하시겠습니까?(y/n) : ");
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
		
		System.out.println("국어 평균 : " + (sumKor / (count+1)));
		System.out.println("영어 평균 : " + (sumEng / (count+1)));
		System.out.println("수학 평균 : " + (sumMath / (count+1)));
		System.out.println("전과목 평균 : " + ((sumKor + sumEng + sumMath)/ ((count+1) * 3)));
		
		

	}

}
