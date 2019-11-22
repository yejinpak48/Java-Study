package com.kh.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		
		//현재 잔액 조회 0원
		a.displayBalance();
		
		//100만원 입금
		a.deposit(1000000);
		a.displayBalance();
		
		//추가로 150만원 입금
		a.deposit(1500000);
		a.displayBalance();
		
		//용돈이 필요해서 50만원 인출
		a.withdraw(500000);
		a.displayBalance();
		
		//누군가 account 객체의 입출금 기능을 무시하고 잔액을 모두 인출해갔다.
		/*a.balance -= 2000000;*/
		
		//갑작스러운 경조사비로 인해 50만원 인출
		a.withdraw(500000);
		a.displayBalance();
		
	}

}














