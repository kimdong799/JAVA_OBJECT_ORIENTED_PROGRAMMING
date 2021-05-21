package Week2;
import java.util.Scanner;
public class Calculator {

	//°è»ê±â Å¬·¡½º¸¦ Á¦ÀÛÇÏ½Ã¿À
	// µ¡¼À –E¼À °ö¼À ³ª´°¼À ±â´ÉÀ» °¡Á®¾ß ÇÔ
	// Å¬·¡½º´Â µÎ °³ÀÇ º¯¼ö¸¦ ¸â¹öº¯¼ö·Î °¡Áü.
	
	int a,b; // ¸â¹öº¯¼ö
	
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
