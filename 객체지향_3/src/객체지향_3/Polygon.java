package ��ü����_3;

import java.util.Scanner;

public class Polygon {

	int width,height;
	char type;
	
	public Polygon( char t, int w, int h) {
		this.width = w;
		this.height = h;
		this.type = t;
	}
	public void cal_area() {
		if(this.type =='T')//�ﰢ���� ���
			System.out.println("���:"+(this.width * this.height * 0.5));
		else if(this.type =='R')//�簢���� ���
			System.out.println("���:"+(this.width * this.height));
		else //�� ���� ���
			System.out.println("����:R�̳� T �� �Է��Ͻÿ�.");
	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�:");
		Polygon p = new Polygon(sc.next().charAt(0),sc.nextInt(),sc.nextInt());
//		p.type = sc.next().charAt(0);
//		p.width = sc.nextInt();
//		p.height = sc.nextInt();
		p.cal_area();
	}

}
