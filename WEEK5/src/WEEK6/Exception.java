package WEEK6;
import java.util.Scanner;

// �߻� ������ ���ܴ� ������ 0���� ������ ���!

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.\n���� ���� �˷��帳�ϴ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// ����ó�� ����
		try {
			System.out.println("��: "+a/b);
		} catch(ArithmeticException err) {
			System.out.println("0���� ������ �ȵ˴ϴ�.\n�ٽ� �Է��ϼ���.");
			while(b==0) {
				b = sc.nextInt();
				System.out.println("�� :"+a/b);
			}
		}
		System.out.println("���α׷� ����");
	}
}
