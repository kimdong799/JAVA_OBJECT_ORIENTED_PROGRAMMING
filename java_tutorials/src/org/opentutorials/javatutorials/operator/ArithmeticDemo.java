package org.opentutorials.javatutorials.operator;
import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		//result �� ���� 3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A�� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("B�� �Է��ϼ���");
		int b = sc.nextInt();
		
		System.out.println("���ϱ⿬�� :"+(int)(a+b));
		System.out.println("���⿬�� :"+(int)(a-b));
		System.out.println("���ϱ⿬�� :"+(int)(a*b));
		System.out.println("�򿬻� :"+(int)(a/b));
		System.out.println("���������� :"+(int)(a%b));
		
		// String ���ڿ��� + ���� ����
		String first = "This is";
		String second = "a concatenated string";
		String third = first+second;
		System.out.println(third);
	}

}
