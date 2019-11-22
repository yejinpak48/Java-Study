package com.kh.inherit.part01_inheritTest.afterInherit.model.vo;

import java.util.Date;

public class Television extends Product{
	//product 클래스를 상속받아 구현하면,
	//product 클래스의 필드와 메소드를 자신의 것처럼 사용할 수 있기 때문에
	//television클래스는 공통적으로 product 클래스에 작성되지 않은
	//필드만 작성한다.
	private int inchType;
	
	public Television() {
		//모든 생성자에는 super()가 생략되어 있다.
		//생성자 호출 시 부모 생성자의 호출부터 된다.
		super();
	}
	//모든 필드를 매개변수로 선언하는 생성자의 경우
	//부모의 필드 초기화에 사용할 값을 매개변수로 함께 받는다.
	public Television(String brand, String productNumber,
					String productCode, String productName,
					int price, Date manufacturingDate,
					int inchType) {
		//부모 생성자를 호출하는 super() 생성자를 통해 값을 전달한다.
		super(brand, productNumber, productCode, productName,
				price, manufacturingDate);
		//부모 생성자에서 필요하지 않은 값은 자식 클래스의 필드를 초기화한다.
		this.inchType = inchType;
		
		System.out.println("product를 상속받은 television클래스의 생성자 호출 완료...");
	}
	public int getInchType() {
		return inchType;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	@Override
	public String printInformation() {
		//부모의 필드가 private인 경우 바로 접근하지 못한다.
		/* return super.brand*/;
		/*return super.getBrand() + ", " +
				super.getProductNumber() + ", " + 
				super.getProductCode() + ", " +
				getProductName() + ", " + 
				getPrice() + ", " + 
				getManufacturingDate() + ", " + 
				this.inchType;*/
		return super.printInformation() + ", " + this.inchType;
	}
	
	
}












