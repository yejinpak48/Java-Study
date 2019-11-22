package com.kh.chap01_encapsulation;

public class Account {
	//private 접근제한자 사용하지 않고 필드 선언
	/*String name = "김진호";				//계좌주
	String accNo = "010-7660-7771";		//계좌번호
	String pwd = "1234";				//비밀번호
	int bankCode = 20;					//은행코드
	int balance = 0;					//잔액
*/	
	
	//private 접근제한자 사용
	private String name = "김진호";
	private String accNo = "010-7660-7771";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	
	//생성자(객체를 생성하기 위한 일종의 메소드)
	public Account() {}
	
	
	//입금을 위한 메소드
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	//출금을 위한 메소드
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금 되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요");
		}
	}
	
	//잔액을 조회하는 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌 잔액은 " + balance + "원 입니다.");
	}
	
}


















