package Week2;
import java.util.Scanner;
public class Calculator {

	//���� Ŭ������ �����Ͻÿ�
	// ���� �E�� ���� ������ ����� ������ ��
	// Ŭ������ �� ���� ������ ��������� ����.
	
	int a,b; // �������
	
	public void sum() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public void mul() {
		System.out.println(a*b);
	}
	public void div() {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		c.a = sc.nextInt();
		c.b = sc.nextInt();
		c.sum();
		c.sub();
		c.mul();
		c.div();

	}

}
