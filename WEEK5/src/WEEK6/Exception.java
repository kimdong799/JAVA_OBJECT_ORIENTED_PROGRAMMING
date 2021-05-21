package WEEK6;
import java.util.Scanner;

// 발생 가능한 예외는 정수를 0으로 나눴을 경우!

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.\n나눈 몫을 알려드립니다.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 예외처리 구문
		try {
			System.out.println("몫: "+a/b);
		} catch(ArithmeticException err) {
			System.out.println("0으로 나누면 안됩니다.\n다시 입력하세요.");
			while(b==0) {
				b = sc.nextInt();
				System.out.println("몫 :"+a/b);
			}
		}
		System.out.println("프로그램 종료");
	}
}
