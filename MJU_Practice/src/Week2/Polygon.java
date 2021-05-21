package Week2;
import java.util.Scanner;

public class Polygon {

	int a;
	int b;
	char c;
	
	public void calculate() {
		if(c=='r') {
			System.out.println(a*b);
		}
		else if(c=='t') {
			System.out.println((a*b)/2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Polygon p = new Polygon();
		
		System.out.println("밑변을 입력하세요");
		p.a=sc.nextInt();
		System.out.println("높이를 입력하세요");
		p.b=sc.nextInt();
		System.out.println("사각형은 r, 삼각현은 t를 입력하세요.");
		p.c=sc.next().charAt(0);
		while(true) {
			if(p.c=='r')break;
			else if(p.c=='t')break;
			else System.out.println("잘못 입력했습니다. 다시 입력하세요!"); p.c=sc.next().charAt(0);
		}
		p.calculate();

	}

}
