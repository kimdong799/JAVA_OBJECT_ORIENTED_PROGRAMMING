package WEEK6;
import java.util.Scanner;

public class StudentNoFormat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�濵�����а� 60161051 �赿��");
		System.out.println("���Է�: ");
		int row = sc.nextInt();
		int a = 1;
		
		for(int i=0; i<row; i++) {
			 for(int j=0; j<i+1; j++) {
				 System.out.printf("%3d",a);
				 a+=2;
			 }
			 System.out.println();
		}
	}

}
