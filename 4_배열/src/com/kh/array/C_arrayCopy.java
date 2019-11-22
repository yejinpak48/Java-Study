package com.kh.array;

public class C_arrayCopy {
	public void shallowCopy() {
		//얕은 복사는 배열의 주소만 복사한다.
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		
		System.out.println("originArr : " + str);
		
		str = "";
		
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
			
		}
		System.out.println("copyArr : " + str);
		
		//원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;
		
		str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("변경 후 originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i] + ", ";
			}
		}
		System.out.println("변경 후 copyArr : " + str);
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
	}
	public void deepCopy() {
		//깊은 복사는 동일한 새로운 배열을 하나 생성하고 값을 복사하는 것이다.
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		//for문을 이용하여 값을 1:1로 복사한다.
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		originArr[0] = 99;
		
		str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("변경 후 originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("변경 후 copyArr : " + str);
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
		
	}
	public void deepCopy2() {
		//arraycopy()를 이용한 배열 복사
		//원본 배열의 시작 인덱스와 복사본 배열의 시작 인덱스를 다르게 할 수도 있다.
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(원본배열, 복사를시작할인덱스, 복사할배열, 복사를시작할인덱스, 복사할길이);
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		//배열값 출력
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
		
	}
	public void deepCopy3() {
		//clone()을 이용한 복사
		//시작 인덱스를 지정할 수 없으며, 
		//원본 배열을 통째로 복사해 새로운 배열을 할당한다.
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
		
		//복사본 배열이 미리 할당이 되어 있는 경우
		//기존 배열을 버리고 복사한 새로운 배열을 참조한다.
		copyArr = originArr.clone();
		
		System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
		
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			}else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		str = "";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
	
	
	
	}
}


























