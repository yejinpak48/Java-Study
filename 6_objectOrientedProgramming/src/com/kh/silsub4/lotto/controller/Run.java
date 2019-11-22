package com.kh.silsub4.lotto.controller;

import com.kh.silsub4.lotto.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		/*Lotto lotto = new Lotto();
		lotto.information();*/
		
		//로또 자동 5게임 구매
		System.out.println("=== 이번주 당첨 예상 번호 ===");
		for(int i = 0; i < 5; i++) {
			Lotto lotto = new Lotto();
			
			lotto.information();
		}

	}

}














