package Overloading;

public class Overloading {
	
	public void same(int a) {
		System.out.println("정수를 입력했습니다.");
	}
	public void same(float a) {
		System.out.println("실수를 입력했습니다.");
	}
	public void same(String a) {
		System.out.println("문자열을 입력했습니다.");
	}
 //	public int same(String s) {System.out.println("문자열을 입력했습니다."); return 1;}
 // 위 두 string 메소드는 각각 사용 가능하지만 둘다 사용할 수 없다.
	// 호출하는 입장에서 충돌이 발생하기 때문.
}
