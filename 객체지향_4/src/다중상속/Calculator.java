package 다중상속;

public class Calculator {
	int x, y;
	
	int add() {
		return this.x+this.y;
	}
	
	int sub() {
		return this.x - this.y;
	}
	
	int mul() {
		return this.x * this.y;
	}
	
	int div() {
		return this.x / this.y;
	}
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y= y;
		
	}
	/*
	// 기본생성자 생성해야 오류생기지 않음.
	public Calculator()
	{
		
	}
	*/
}
