package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		// 이 경우 같은 형식으로 자동 convert됨. 
		//더 정밀한 수로 형변환되어 둘다 실수로 변환됨.
		System.out.println(a/d);

	}

}
