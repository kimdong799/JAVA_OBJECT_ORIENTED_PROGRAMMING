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
//		Kim hk = new Human();   �θ� Ÿ���� ���������� �ڽ�Ÿ���� �ν��Ͻ��� ������ �� ������ �ݴ�� �Ұ�
		
		h.call();
		k.call();
		kh.call();
		k.run();
//		kh.run();  Human�� �������� �ʴ� �޼ҵ�� ��� �Ұ�.
		
	}

}
