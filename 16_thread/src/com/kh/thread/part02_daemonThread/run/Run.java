package com.kh.thread.part02_daemonThread.run;

import javax.swing.JOptionPane;

import com.kh.thread.part02_daemonThread.thread.CountDown;

public class Run {

	public static void main(String[] args) {
		Thread t = new CountDown();
		
		//������ ������, ���н� �迭�� �ü������ ��׶��忡�� �����ϴ�
		//���α׷��� ���Ѵ�.
		//�̿� ����ϰ� �����ϵ��� ���� ���� ���󾲷����� �Ѵ�.
		//���ξ����尡 ����Ǿ �������� ���� ������ ���� �����ϴ� ����
		//���󾲷���� ������ �����带 ����ϸ�
		//���ξ����尡 ����� �� ���󾲷��嵵 �Բ� ����ȴ�.
		t.setDaemon(true);
		
		t.start();
		System.out.println(JOptionPane
				.showInputDialog("�ƹ� ���ڿ��̳� �Է��غ�����"));
		
		
		System.out.println("���ξ����� ����");

	}

}











