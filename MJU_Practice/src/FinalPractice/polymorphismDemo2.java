package FinalPractice;

class Human{
	public void call() {
		System.out.println("Human Call");
	}
}
class Kim extends Human{
	public void call() {
		System.out.println("Kim Call");
	}
	public void run() {
		System.out.println("Kim run");
	}
}
public class polymorphismDemo2 {

	public static void main(String[] args) {
		Human h = new Human();
		Kim k = new Kim();
		Human kh = new Kim();
//		Kim hk = new Human();   부모 타입의 참조변수로 자식타입의 인스턴스를 참조할 수 있지만 반대는 불가
		
		h.call();
		k.call();
		kh.call();
		k.run();
//		kh.run();  Human에 존재하지 않는 메소드는 사용 불가.
		
	}

}
