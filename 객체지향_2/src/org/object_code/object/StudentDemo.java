package org.object_code.object;

import java.util.Scanner;//import �κ� 

public class StudentDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//
		
		Student a = new Student();
		System.out.print("����������:");
		a.score_Eng = scn.nextInt();//������Ÿ��
		System.out.print("����������:");
		a.score_Kor = scn.nextInt();//������Ÿ��
		System.out.println(a.sum());

	}

}
