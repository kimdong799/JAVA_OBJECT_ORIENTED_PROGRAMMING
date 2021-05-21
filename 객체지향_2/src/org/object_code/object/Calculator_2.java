package org.object_code.object;

import java.util.Scanner;
public class Calculator_2 {
	
	int a;
	int b;
	
	int sum() {
		return a+b;
	}
	int sub() {
		return a-b;
	}
	int mul() {
		return a*b;
	}
	int div() {
		return a/b;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Calculator_2 c = new Calculator_2();
		
		System.out.println("첫번째수");
		c.a = scn.nextInt();
		System.out.println("두번째수");
		c.b = scn.nextInt();
		
		System.out.println("두수의 합은"+c.sum());
		System.out.println("두수의 차는"+c.sub());
		System.out.println("두수의 곱은"+c.mul());
		System.out.println("두수의 몫은"+c.div());

	}

}
