package com.kh.io.silsub2.controller;

import java.util.Scanner;

import com.kh.io.silsub2.model.dao.NoteDao;

public class NoteManager {
	private Scanner sc = new Scanner(System.in);

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		System.out.print("���Ͽ� ������ ������ �Է��ϼ��� : ");
		
		while(true){
			String s = sc.nextLine();
			
			if(s.equals("exit")){
				break;
			}
			
			sb.append(s + "\n");
			
		}
		
		System.out.print("�����Ͻðڽ��ϱ�?(y/n) : ");
		char yn = sc.nextLine().toUpperCase().charAt(0);
		
		if(yn == 'Y'){
			System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
			String fileName = sc.nextLine();
			
			NoteDao nd = new NoteDao();
			
			nd.fileSave(sb, fileName);
			
		}else{
			System.out.println("�������� �ʰ� �޴��� ���ư��ϴ�.");
			return;
		}
		
	}

	public void fileOpen() {
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		
		StringBuilder sb = new NoteDao().fileOpen(fileName);
		
		System.out.println(sb);
		
	}

	

}
