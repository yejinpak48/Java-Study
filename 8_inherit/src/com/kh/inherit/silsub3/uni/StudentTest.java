package com.kh.inherit.silsub3.uni;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Student[] ar = new Student[3];

				ar[0] = new Student("ȫ�浿", 15, 171, 81, "201101", "����");
				ar[1] = new Student("�ѻ��", 13, 183, 72, "201102", "����");
				ar[2] = new Student("�Ӱ���", 16, 175, 65, "201103", "����");
				
			
				for(int i = 0; i < ar.length; i++){
					System.out.println(ar[i]);
				}

	}

}
