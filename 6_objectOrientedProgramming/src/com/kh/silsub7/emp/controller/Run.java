package com.kh.silsub7.emp.controller;

import java.util.Scanner;

import com.kh.silsub7.emp.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է��ϼ��� : ");
		int empNo = sc.nextInt();
		System.out.print("�̸��� �Է��ϼ��� : ");
		sc.nextLine();
		String empName = sc.nextLine();
		System.out.print("�μ��� �Է��ϼ��� : ");
		String dept = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		String job = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�޿��� �Է��ϼ��� : ");
		int salary = sc.nextInt();
		System.out.print("���ʽ�����Ʈ�� �Է��ϼ��� : ");
		double bonusPoint = sc.nextDouble();
		System.out.print("�޴��� ��ȣ�� �Է��ϼ��� : ");
		sc.nextLine();
		String phone = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
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
