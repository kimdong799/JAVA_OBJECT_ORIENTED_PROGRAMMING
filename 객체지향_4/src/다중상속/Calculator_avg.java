package ���߻��;

public class Calculator_avg extends Calculator{

	public Calculator_avg(int x, int y) {
		super(x,y);
	
//	public Calculator_avg(int x, int y) { //������ 
// ���� Ŭ�������� ��ü�� ���鶧 �����ڰ� ȣ��Ǹ� �� ���ÿ� �θ�Ŭ������ �ִ� �⺻ �����ڰ� ȣ��ȴ�.
// �⺻ ������ �ܿ� �ٸ� ������ ȣ��ǵ��� �Ϸ��� super�� ����ϸ� ��.
	}
	
	public int avg() { // �޼ҵ�
		return (super.x+super.y)/2;
	}
	
	public static void main(String[] args) {
		
		//��ü ����
		Calculator_avg c = new Calculator_avg(10,20);
		System.out.println(c.avg());
	}

}
