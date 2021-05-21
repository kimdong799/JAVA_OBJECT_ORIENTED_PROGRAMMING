package FinalPractice;

class Super{
	int x = 100;
	int y = 200;
	public void ss() {
		System.out.println("부모클래스");
	}
}
class Child extends Super{
	int j = 1000;
	int z = 2000;
	public void ss() {
		System.out.println("자식클래스");
	}
}
public class polymorphismDemo {

	public static void main(String[] args) {
		Super s = new Super();
		Child c = new Child();
		Super sc = new Child();
		s.ss();
		c.ss();
		sc.ss();

	}

}
