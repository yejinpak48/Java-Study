package com.kh.chap02_class.defaultClassTest.model.vo;

//접근제한자를 작성하지 않으면 default의 의미를 가진다.
//default라고 명시를 하게 되면 에러 발생함
/*default*/ class TestDefaultClass {
	public void test() {
		System.out.println("default클래스 내의 test() 호출됨...");
	}
}
