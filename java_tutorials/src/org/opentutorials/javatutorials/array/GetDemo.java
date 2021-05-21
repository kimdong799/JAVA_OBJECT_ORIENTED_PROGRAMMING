package org.opentutorials.javatutorials.array;

public class GetDemo {

	public static void main(String[] args) {
		
		//0부터 시작, 최진혁=0번째
		String[]classGroup= {"최진혁","최유빈","한아람","이고잉"}; //element
		// 문자열 배열 생성.
		
		System.out.println(classGroup[0]); //index 혹은 색인
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		
		System.out.println(classGroup.length); //classGroup 배열의 길이(원소의 개수) 반환
	}

}
