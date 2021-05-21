package 다중상속;

public class PhoneClass {

	private String phone_number = "01021015291";
	// 멤버변수의 경우 변수값이 임의로 바뀌는 것을 막기 위해, 원치않는 자료의 접근이나 조작 변경을 막기위해
	// private으로 선언해 해당 클래스 내부에서만 멤버변수를 수정할 수 있도록 함.
	// 외부에서 접근하려면 메소드를 직접접근할 수는 없고, 멤버변수를 핸들링하는 내부의 다른 메소드를 통해 접근 가능.
	
	// 따라서 메소드는 외부에서도 사용 가능하도록 public으로 선언
	public void show_phone_number() {
		System.out.println(phone_number);
	}
	
	public void call(String call_number) {
		System.out.println("전화가 걸렸습니다.");
	}
	
	public void hang_up() {
		System.out.println("통화가 종료되었습니다.");
		
	}
	
	public static void main(String[] args) {
		
		PhoneClass p = new PhoneClass();
		p.show_phone_number();
		p.call("01073726912");
		p.hang_up();
	}

}
