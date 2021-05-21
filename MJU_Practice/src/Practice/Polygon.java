package Practice;
import java.util.Scanner;

public class Polygon {
	
	int x, y;
	char c;
	
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("X를 입력하세요");
		this.x=sc.nextInt();
		System.out.println("Y를 입력하세요");
		this.y=sc.nextInt();
		while (true) {
			System.out.println("사각형은 r, 삼각형은 t를 입력하세요.");
			this.c = sc.next().charAt(0);
			
			if(this.c=='t') {
				System.out.println(x*y/2);
				break;
			}
			else if(this.c=='r') {
				System.out.println(x*y);
				break;
			}
			else System.out.println("다시 입력하세요.");
		}
	}

	public static void main(String[] args) {
		Polygon p = new Polygon();
		p.calculate();

	}

}
