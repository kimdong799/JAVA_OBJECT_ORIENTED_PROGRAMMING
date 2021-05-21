package 다중상속;

public class Calculator_avg extends Calculator{

	public Calculator_avg(int x, int y) {
		super(x,y);
	
//	public Calculator_avg(int x, int y) { //생성자 
// 하위 클래스에서 객체를 만들때 생성자가 호출되면 그 동시에 부모클래스에 있는 기본 생성자가 호출된다.
// 기본 생성자 외에 다른 생성자 호출되도록 하려면 super를 사용하면 됨.
	}
	
	public int avg() { // 메소드
		return (super.x+super.y)/2;
	}
	
	public static void main(String[] args) {
		
		//객체 생성
		Calculator_avg c = new Calculator_avg(10,20);
		System.out.println(c.avg());
	}

}
