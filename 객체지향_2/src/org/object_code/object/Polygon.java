package org.object_code.object;

import java.util.Scanner;

public class Polygon {

	char c;
	
	int a;
	int b;
	
	
	void calculate_area()
	{	
		if(c=='T')System.out.println("�ﰢ���� ����:"+this.a*this.b/2);
		else if(c=='R') System.out.println("�簢���� ����:"+this.a * this.b);
		else System.out.println("�ý��� �����Դϴ�.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Polygon p = new Polygon();
		
		System.out.println("�濵�����а� 60161051 �赿��");
		System.out.println("--------POLYGON ���α׷��� �����մϴ�.-----------");
		System.out.println("�簢���� R, �ﰢ���� T�� �Է��ϼ���.");
		
		while (true) 
		{
			p.c  = scn.next().charAt(0);
			if(p.c != 'T' && p.c !='R')System.out.println("�ٽ��Է��ϼ���");
			else break;
		}
		
		System.out.println("����(�غ�)�� ���� �Է��ϼ���");
		p.a = scn.nextInt();
		System.out.println("����(����)�� ���� �Է��ϼ���");
		p.b = scn.nextInt();
		
		p.calculate_area();
		
		
	}

}
