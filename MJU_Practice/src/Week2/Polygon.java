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
		
		System.out.println("�غ��� �Է��ϼ���");
		p.a=sc.nextInt();
		System.out.println("���̸� �Է��ϼ���");
		p.b=sc.nextInt();
		System.out.println("�簢���� r, �ﰢ���� t�� �Է��ϼ���.");
		p.c=sc.next().charAt(0);
		while(true) {
			if(p.c=='r')break;
			else if(p.c=='t')break;
			else System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���!"); p.c=sc.next().charAt(0);
		}
		p.calculate();

	}

}
