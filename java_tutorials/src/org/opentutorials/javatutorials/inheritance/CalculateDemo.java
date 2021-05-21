package org.opentutorials.javatutorials.inheritance;

class calculate{
	int left, right;
	
	public calculate() {} // �⺻������.
	
	public calculate(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum(){
		System.out.println(this.left + this.right);
	}
	public int avg() {
		return ((this.left+this.right)/2);
	}
}
class subcalculate extends calculate{
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

class mulcalculate extends subcalculate{
	public void mul() {
		System.out.println(this.left*this.right);
	}
}
class divcalculate extends mulcalculate{
	public divcalculate(int left, int right) { //������
		super.left=left;
		super.right=right;
	}
	public void div() {
		System.out.println(this.left/this.right);
	}
	public void sum() {
		System.out.println("���� ����� "+this.left+this.right+"�Դϴ�."); //overriding
	}
	public int avg() {
		return super.avg();
	}
}

public class CalculateDemo {

	public static void main(String[] args) {
		
		divcalculate c = new divcalculate(100,20); // ������ ���ڰ� ����
	//	c.setOprands(10,20);
		c.sum();
		System.out.println(c.avg());
		c.sub();
		c.mul();
		c.div();

	}

}
