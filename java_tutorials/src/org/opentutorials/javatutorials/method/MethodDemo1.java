package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	
	public static void numbering() {
		int i=0;
		while(i<10) {
			System.out.println(i); // i를 0~9까지 출력하는 메소드
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(); //메소드 호출(사용)
		
	}

}
