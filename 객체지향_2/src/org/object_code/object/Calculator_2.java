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
		
		System.out.println("ù��°��");
		c.a = scn.nextInt();
		System.out.println("�ι�°��");
		c.b = scn.nextInt();
		
		System.out.println("�μ��� ����"+c.sum());
		System.out.println("�μ��� ����"+c.sub());
		System.out.println("�μ��� ����"+c.mul());
		System.out.println("�μ��� ����"+c.div());

	}

}
