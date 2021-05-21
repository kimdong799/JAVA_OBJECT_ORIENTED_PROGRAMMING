package org.object_code.object;

import java.util.Scanner;

public class Polygon {

	char c;
	
	int a;
	int b;
	
	
	void calculate_area()
	{	
		if(c=='T')System.out.println("삼각형의 넓이:"+this.a*this.b/2);
		else if(c=='R') System.out.println("사각형의 넓이:"+this.a * this.b);
		else System.out.println("시스템 오류입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Polygon p = new Polygon();
		
		System.out.println("경영정보학과 60161051 김동현");
		System.out.println("--------POLYGON 프로그램을 시작합니다.-----------");
		System.out.println("사각형은 R, 삼각형은 T를 입력하세요.");
		
		while (true) 
		{
			p.c  = scn.next().charAt(0);
			if(p.c != 'T' && p.c !='R')System.out.println("다시입력하세요");
			else break;
		}
		
		System.out.println("가로(밑변)의 값을 입력하세요");
		p.a = scn.nextInt();
		System.out.println("세로(높이)의 값을 입력하세요");
		p.b = scn.nextInt();
		
		p.calculate_area();
		
		
	}

}
