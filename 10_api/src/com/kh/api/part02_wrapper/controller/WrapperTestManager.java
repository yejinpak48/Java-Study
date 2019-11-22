package com.kh.api.part02_wrapper.controller;

public class WrapperTestManager {
	
	public void boxingTest() {
		//기본 자료형을 객체로 변환하는 것을 boxing한다고 하며
		//객체를 기본 자료형으로 변환하는 것을 unboxing이라고한다.
		Integer num1 = new Integer(3);
		Integer num2 = 3;		//오토박싱(autoboxing)처리됨
		
		int num3 = num1;		//오토언박싱(auto unboxing) 처리됨
		
	}
	
	public void parsingTest() {
		//문자열 (String)자료형을 기본자료형으로 변환하는 것을 parsing한다고 함
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4");
		long l = Long.parseLong("8");
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("9.0");
		boolean bl = Boolean.parseBoolean("true");
		
		//Character는 parsing 기능을 제공하지 않는다
		char c = "abc".charAt(0);
		
	}
	
	public void valueOfTest() {
		//기본 자료형을 문자열 객체로 변환하는 기능을 제공한다.
		//valueOf는 기본 자료형 값을 래퍼클래스 객체 타입으로 변경하는 것이고
		//해당 래퍼 클래스별 toString이라는 메소드로 스트링으로 변환해준다.
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(4).toString();
		String l = Long.valueOf(8L).toString();
		String f = Float.valueOf(4.0f).toString();
		String d = Double.valueOf(8.0).toString();
		String bl = Boolean.valueOf(true).toString();
		String c = Character.valueOf('a').toString();
		
		//String클래스의 valueOf를 사용할 수 있다.
		String str = String.valueOf(10);
		
		//문자열 합치기를 이용해 String으로 변환할 수도 있다.
		String str2 = 123 + "";
	}
}



















