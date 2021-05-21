package Week5;

class Calculator{
	static final double PI = 3.14; // PI값에 3.14를 final로 지정. // 바뀌지 않는 값.
	// static은 공통적이라는 의미, final은 바뀌지 않는다는 의미.
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
