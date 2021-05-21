package Practice;
import java.util.Scanner;
public class CaculateDemo {
	int left, right;
	
	public void sum() {
		System.out.println("+ :"+(this.left+this.right));
	}
	public void sub() {
		System.out.println("- :"+(this.left-this.right));
	}
	public void mul() {
		System.out.println("* :"+this.left*this.right);
	}
	public void div() {
		System.out.println("/ :"+this.left/this.right);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CaculateDemo c = new CaculateDemo();
		
		System.out.println("Input A and B");
		c.left=sc.nextInt();
		c.right=sc.nextInt();
		c.sum();
		c.sub();
		c.mul();
		c.div();
	}

}
