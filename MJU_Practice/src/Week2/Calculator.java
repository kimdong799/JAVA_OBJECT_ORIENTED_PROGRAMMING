package Week2;
import java.util.Scanner;
public class Calculator {

	//계산기 클래스를 제작하시오
	// 덧셈 뺼셈 곱셈 나눗셈 기능을 가져야 함
	// 클래스는 두 개의 변수를 멤버변수로 가짐.
	
	int a,b; // 멤버변수
	
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
