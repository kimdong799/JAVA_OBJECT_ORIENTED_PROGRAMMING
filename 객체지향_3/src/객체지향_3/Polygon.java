package 객체지향_3;

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
		if(this.type =='T')//삼각형인 경우
			System.out.println("출력:"+(this.width * this.height * 0.5));
		else if(this.type =='R')//사각형인 경우
			System.out.println("출력:"+(this.width * this.height));
		else //그 외의 경우
			System.out.println("에러:R이나 T 중 입력하시오.");
	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		Polygon p = new Polygon(sc.next().charAt(0),sc.nextInt(),sc.nextInt());
//		p.type = sc.next().charAt(0);
//		p.width = sc.nextInt();
//		p.height = sc.nextInt();
		p.cal_area();
	}

}
