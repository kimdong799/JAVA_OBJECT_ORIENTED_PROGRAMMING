package Practice;
import java.util.Scanner;

public class Polygon {
	
	int x, y;
	char c;
	
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("X�� �Է��ϼ���");
		this.x=sc.nextInt();
		System.out.println("Y�� �Է��ϼ���");
		this.y=sc.nextInt();
		while (true) {
			System.out.println("�簢���� r, �ﰢ���� t�� �Է��ϼ���.");
			this.c = sc.next().charAt(0);
			
			if(this.c=='t') {
				System.out.println(x*y/2);
				break;
			}
			else if(this.c=='r') {
				System.out.println(x*y);
				break;
			}
			else System.out.println("�ٽ� �Է��ϼ���.");
		}
	}

	public static void main(String[] args) {
		Polygon p = new Polygon();
		p.calculate();

	}

}
