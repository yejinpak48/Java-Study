package com.kh.inherit.silsub3.uni;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Student[] ar = new Student[3];

				ar[0] = new Student("홍길동", 15, 171, 81, "201101", "영문");
				ar[1] = new Student("한사람", 13, 183, 72, "201102", "건축");
				ar[2] = new Student("임걱정", 16, 175, 65, "201103", "무영");
				
			
				for(int i = 0; i < ar.length; i++){
					System.out.println(ar[i]);
				}

	}

}
