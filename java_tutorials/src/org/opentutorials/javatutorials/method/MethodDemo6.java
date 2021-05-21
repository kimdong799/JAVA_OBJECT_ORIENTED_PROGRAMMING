package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output ="";
		
		while(i<limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1,5);
		//변수  result의 값을 화면에 출력한다.
		System.out.println(result);

	}

}
