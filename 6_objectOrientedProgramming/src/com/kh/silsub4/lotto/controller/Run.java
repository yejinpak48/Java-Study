package com.kh.silsub4.lotto.controller;

import com.kh.silsub4.lotto.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		/*Lotto lotto = new Lotto();
		lotto.information();*/
		
		//�ζ� �ڵ� 5���� ����
		System.out.println("=== �̹��� ��÷ ���� ��ȣ ===");
		for(int i = 0; i < 5; i++) {
			Lotto lotto = new Lotto();
			
			lotto.information();
		}

	}

}














