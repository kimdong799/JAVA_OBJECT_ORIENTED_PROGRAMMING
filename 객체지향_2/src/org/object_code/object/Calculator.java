package org.object_code.object;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	
	int sum(){
		return num1+num2;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Calculator c = new Calculator();
		System.out.print("ù��°��");
		c.num1 = scn.nextInt();
		c.num2 = scn.nextInt();
		System.out.println("�� ���� ���� "+c.sum());
	}

}
