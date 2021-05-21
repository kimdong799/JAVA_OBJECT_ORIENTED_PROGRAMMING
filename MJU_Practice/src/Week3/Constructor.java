package Week3;

public class Constructor {
	
	int a,b;
	
	public Constructor(int a, int b) {//»ý¼ºÀÚ.
		this.a=a;
		this.b=b;
	}
	public void sum() {
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) {
		Constructor c = new Constructor(10,20);
		c.sum();

	}

}
