package Week5;

class Calculator{
	static final double PI = 3.14; // PI���� 3.14�� final�� ����. // �ٲ��� �ʴ� ��.
	// static�� �������̶�� �ǹ�, final�� �ٲ��� �ʴ´ٴ� �ǹ�.
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	} 
}

public class FinalDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10,20);
		
	}

}
