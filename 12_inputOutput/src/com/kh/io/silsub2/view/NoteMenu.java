package com.kh.io.silsub2.view;

import java.util.Scanner;

import com.kh.io.silsub2.controller.NoteManager;

public class NoteMenu {

	public void menu() {
		
		NoteManager nm = new NoteManager();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=========== MyNote ===========");
			System.out.println();
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ������");
			System.out.println();
			System.out.print("�޴� ���� : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : nm.fileSave(); break;
				case 2 : nm.fileOpen(); break;
				case 3 : System.out.println("Note���α׷��� �����մϴ�."); return;
				default : System.out.println("��ȣ ������ �߸��Ǿ����ϴ�.");
							System.out.println("�ٽ� �����Ͻʽÿ� \n");
				
			}
			
		}while(true);
		
	}

}
