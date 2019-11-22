package com.kh.silsub7.emp.controller;

import java.util.Scanner;

import com.kh.silsub7.emp.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번을 입력하세요 : ");
		int empNo = sc.nextInt();
		System.out.print("이름을 입력하세요 : ");
		sc.nextLine();
		String empName = sc.nextLine();
		System.out.print("부서를 입력하세요 : ");
		String dept = sc.nextLine();
		System.out.print("직급을 입력하세요 : ");
		String job = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.print("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		System.out.print("보너스포인트를 입력하세요 : ");
		double bonusPoint = sc.nextDouble();
		System.out.print("휴대폰 번호를 입력하세요 : ");
		sc.nextLine();
		String phone = sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		e.setEmpNo(empNo);
		e.setEmpName(empName);
		e.setDept(dept);
		e.setJob(job);
		e.setAge(age);
		e.setGender(gender);
		e.setSalary(salary);
		e.setBonusPoint(bonusPoint);
		e.setPhone(phone);
		e.setAddress(address);
		
		System.out.println(e.getEmpNo());
		System.out.println(e.getEmpName());
		System.out.println(e.getDept());
		System.out.println(e.getJob());
		System.out.println(e.getAge());
		System.out.println(e.getGender());
		System.out.println(e.getSalary());
		System.out.println(e.getBonusPoint());
		System.out.println(e.getPhone());
		System.out.println(e.getAddress());
	}

}
