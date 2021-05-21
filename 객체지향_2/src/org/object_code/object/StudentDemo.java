package org.object_code.object;

import java.util.Scanner;//import 부분 

public class StudentDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//
		
		Student a = new Student();
		System.out.print("국어점수는:");
		a.score_Eng = scn.nextInt();//데이터타입
		System.out.print("영어점수는:");
		a.score_Kor = scn.nextInt();//데이터타입
		System.out.println(a.sum());

	}

}
