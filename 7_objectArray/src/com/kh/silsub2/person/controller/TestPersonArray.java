package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		//1. Person Ŭ������ ���� ��ü �迭 5�� ������
		Person[] par = new Person[5];

		//2. Ű����� 5 ����� ������ �Է¹޾�, �� ��ü�� �����
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < par.length; i++){
			par[i] = new Person();

			System.out.print(i + "��° �̸� : ");
			par[i].setName(sc.next());
			System.out.print("���� : ");
			par[i].setAge(sc.nextInt());
			System.out.print("����(��/��) : ");
			par[i].setGender(sc.next().charAt(0));
			System.out.print("Ű(�Ҽ��� ù°�ڸ�����) : ");
			par[i].setHeight(sc.nextDouble());
			System.out.print("������(�Ҽ��� ù°�ڸ�����) : ");
			par[i].setWeight(sc.nextDouble());

		}

		//3. ��� Ȯ����
		for(int i = 0; i < par.length; i++)
			System.out.println(par[i].personInfo());

		//4. 5���� ����, Ű, �������� ����� ���Ͽ� ���� �����
		int totAge = 0;
		double totHeight = 0.0, totWeight = 0.0;

		for(int i = 0; i < par.length; i++){
			totAge += par[i].getAge();
			totHeight += par[i].getHeight();
			totWeight += par[i].getWeight();
		}

		System.out.println("���� ��� : " + (totAge / par.length));
		System.out.println("Ű ��� : " + (totHeight / par.length));
		System.out.println("������ ��� : "+ (totWeight / par.length));
	}

}
