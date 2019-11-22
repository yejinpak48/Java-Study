package com.kh.poly.part01_polymorphismTest.animal.controller;

import com.kh.poly.part01_polymorphismTest.animal.model.vo.Animal;
import com.kh.poly.part01_polymorphismTest.animal.model.vo.Chicken;
import com.kh.poly.part01_polymorphismTest.animal.model.vo.Player;
import com.kh.poly.part01_polymorphismTest.animal.model.vo.Tiger;

public class PlayerManager {
	
	public void startPlay(String name) {
		//플레이어 객체 만들고 사냥 시작
		Player p = new Player(name);
		
		System.out.println(p.getName() + "님께서 등장하셨습니다.");
		
		//플레이어 기본 경험치 확인
		System.out.println(p);
		
		//치킨 한마리 등장
		//닭은 동물이기 때문에 동물 타입으로 선언 가능함
		/*Chicken c1 = new Chicken(100, 100, "초보닭");*/
		Animal c1 = new Chicken(100, 100, "초보닭");
		
		c1.cry();
		
		//닭 공격
		//부모 타입인 경우 여러 자식이 있을 수 있기 때문에
		//어떤 자식 객체의 메소드인지 형변환을 통해 알려줘야 함
		//해당 타입이 맞는지는 instanceof 연산자를 사용해서 알 수 있음
		//만약 casting 하려는 타입이 일치하지 않는 경우 ClassCastException발생
		if(c1 instanceof Chicken) {
			((Chicken)c1).hitChicken();
		}
		
		//남은 hp만큼 반복 공격
		for(int i = c1.getHp(); i > 0; i -= 10) {
			/*c1.hitChicken();*/
			if(c1 instanceof Chicken) {
				((Chicken) c1).hitChicken();
			}
		}
		
		//플레이어 경험치 증가
		p.setExp(p.getExp() + c1.getExp());
		
		//플레이어 정보 확인
		System.out.println(p);
		
		Animal t1 = new Tiger(1000, 1000, "시베리안호랑이");
		
		for(int i = t1.getHp(); i > 0; i -= 50) {
			if(t1 instanceof Tiger) {
				((Tiger) t1).hitTiger();
			}
		}
		
		p.setExp(p.getExp() + t1.getExp());
		
		System.out.println(p);
		
	
	}
}


















