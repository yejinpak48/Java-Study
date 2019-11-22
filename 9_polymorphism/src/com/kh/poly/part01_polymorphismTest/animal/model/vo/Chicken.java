package com.kh.poly.part01_polymorphismTest.animal.model.vo;

public class Chicken extends Animal{
	
	public Chicken(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	
	public void cry() {
		System.out.println("닭이 꼬끼오~ 하고 울음소리를 냅니다.");
	}
	
	public void peck() {
		System.out.println("닭이 쪼았습니다.");
	}
	
	public void hitChicken() {
		System.out.println("닭이 비명을 지르며 hp가 10이 감소합니다.");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("닭이 쓰러집니다. 경험치가 " 
							+ super.getExp() + "만큼 상승합니다.");
		}
	}
}















