package Week4;

abstract class Human{
	
	String name;
	
	public Human() {} // 기본생성자
	
	public Human(String name) { //인자값이 있는 생성자.
		this.name = name;
	}
// 자식클래스는 부모 클래스의 매개변수가 있는 생성자를 호출할 수 없어 기본생성자를 만들어줘야한다.
	// 또한 하위 클래스에서 같은 역할의 생성자를 만든다면 이는 중복이 발생하므로 많은 문제를 야기한다. 따라서 사용하는것이 super이다.

	abstract void move();
	
	abstract void cry();
	
}

class Baby extends Human {
	
	public void move(){
		System.out.println("엉금엉금");
	}
	public void cry() {
		System.out.println("응애응애");
	}
}

class Adult extends Human{
	
	public Adult(String name) {
		super.name = name; 
	}
	public void move(){
		System.out.println(name+": 저벅저벅");
	}
	public void cry() {
		System.out.println("흑흑");
	}
}

public class HumanDemo {

	public static void main(String[] args) {
		
		Baby b = new Baby();
		Adult a = new Adult("김동현");
		
		b.cry();
		b.move();
		a.cry();
		a.move();
	}

}
