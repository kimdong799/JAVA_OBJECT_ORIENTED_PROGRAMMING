package FinalPractice;

class Super{
	int x = 100;
	int y = 200;
	public void ss() {
		System.out.println("�θ�Ŭ����");
	}
}
class Child extends Super{
	int j = 1000;
	int z = 2000;
	public void ss() {
		System.out.println("�ڽ�Ŭ����");
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
