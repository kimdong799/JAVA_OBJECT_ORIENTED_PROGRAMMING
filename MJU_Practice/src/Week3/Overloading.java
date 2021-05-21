package Week3;

public class Overloading {
	
	public void same(int a) {
		System.out.println("정수를 입력했습니다.");
	}
	public void same(int a, int b) {
		System.out.println("정수 두개를 입력했습니다.");
	}
	public void same(double b) {
		System.out.println("실수를 입력했습니다.");
	}
	public void same(String c) {
		System.out.println("문자열을 입력했습니다.");
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.same(1);
		o.same(1,2);
		o.same(2.4);
		o.same("오버로딩 연습");

	}

}
