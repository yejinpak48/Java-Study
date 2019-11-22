package com.kh.silsub4.lotto.model.vo;

import java.util.Random;

public class Lotto {
	private int lottoNums[];
	
	{
		lottoNums = new int[6];
			
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = new Random().nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < lottoNums.length; i++) {
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] < lottoNums[j]) {
					int temp;
					temp = lottoNums[i];
					lottoNums[i] = lottoNums[j];
					lottoNums[j] = temp;
				}
			}
		}
	}
	
	public Lotto() {}
	
	public int[] getLottoNums() {
		return lottoNums;
	}
	public void setLottoNums(int[] lottoNums) {
		this.lottoNums = lottoNums;
	}
	public void information() {
		for(int i = 0; i < lottoNums.length; i++) {
			if(lottoNums[i] < 10) {
				System.out.print("0" + lottoNums[i] + " ");
			}else {
				System.out.print(lottoNums[i] + " ");
			}
		}
		System.out.println();
	}
}
















