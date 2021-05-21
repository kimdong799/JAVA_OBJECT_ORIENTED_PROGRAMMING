package Week6;

public class CalException {
	int left, right;
	
	public CalException(int a, int b) {
		this.left = a;
		this.right = b;
	}
	
	public void sum() {
		System.out.println(left+right);
	}
	
	public void divide() {
		//오류가 발생했습니다.:/ by zero
		try {
			System.out.println(left/right);
		}
		catch(Exception e){
			System.out.println("오류가 발생했습니다.:"+e.getMessage());
		}
	}

	public static void main(String[] args) {
		CalException E = new CalException(10,0);
		
		E.sum();
		E.divide();// 정수를 0으로 나누어 예외 발생.
		
		
		
	}

}
