package org.opentutorials.javatutorials.operator;
import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		//result 의 값은 3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A를 입력하세요");
		int a = sc.nextInt();
		System.out.println("B를 입력하세요");
		int b = sc.nextInt();
		
		System.out.println("더하기연산 :"+(int)(a+b));
		System.out.println("빼기연산 :"+(int)(a-b));
		System.out.println("곱하기연산 :"+(int)(a*b));
		System.out.println("몫연산 :"+(int)(a/b));
		System.out.println("나머지연산 :"+(int)(a%b));
		
		// String 문자열도 + 연산 가능
		String first = "This is";
		String second = "a concatenated string";
		String third = first+second;
		System.out.println(third);
	}

}
