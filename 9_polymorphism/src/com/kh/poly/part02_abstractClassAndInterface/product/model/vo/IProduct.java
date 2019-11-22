package com.kh.poly.part02_abstractClassAndInterface.product.model.vo;

import java.io.Serializable;
import java.util.Comparator;

//추상메소드만 멤버로 가질 수 있는 추상클래스를 인터페이스라고 한다.
//상수 필드만 멤버로 추가할 수 있다.

//인터페이스간 상속은 extends를 사용하며 다중 상속을 지원한다.
//클래스에서 인터페이스 상속 시 implements 키워드를 사용하지만
//인터페이스간 상속은 implements 사용이 불가능하다.
public interface IProduct extends Serializable/*, Comparator*/
		/*implements Iterator*/{
	//상수 필드는 반드시 선언과 동시에 초기화가 되어 있어야 한다.
	//모든 필드는 묵시적으로 public static final이다.
	/*public static final */String PRODUCT_NAME = "상품명";
	
	//인터페이스 안에 선언된 메소드는 모두 추상메소드이기 때문에
	//선언시 public abstract를 생략할 수 있다.
	//따라서 후손은 오버라이딩시 반드시 public으로 해야 한다.
	/*public abstract void abstIMethod();*/
	void abstIMethod();
	
	//인터페이스 내에서는 몸체 있는 메소드 작성이 불가능하다.
	/*void method() {}*/

}
















