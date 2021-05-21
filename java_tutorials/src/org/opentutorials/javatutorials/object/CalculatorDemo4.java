package org.opentutorials.javatutorials.object;

public class CalculatorDemo4 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public static void main(String[] args) {
		
		CalculatorDemo4 c1 = new CalculatorDemo4();
		c1.setOprands(10,20);
		c1.sum();

	}

}
