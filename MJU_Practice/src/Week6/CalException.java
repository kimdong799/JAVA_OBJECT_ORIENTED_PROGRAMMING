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
		//������ �߻��߽��ϴ�.:/ by zero
		try {
			System.out.println(left/right);
		}
		catch(Exception e){
			System.out.println("������ �߻��߽��ϴ�.:"+e.getMessage());
		}
	}

	public static void main(String[] args) {
		CalException E = new CalException(10,0);
		
		E.sum();
		E.divide();// ������ 0���� ������ ���� �߻�.
		
		
		
	}

}
