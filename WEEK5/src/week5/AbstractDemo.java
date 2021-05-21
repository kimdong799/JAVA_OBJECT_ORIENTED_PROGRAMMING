package week5;

abstract class Animal{
	private String name;
	abstract void move();
	abstract void howl();
	Animal(String s){
		name = s;
	}
}

class Horse extends Animal{
	public Horse(String s) {
		super(s);
	}
	public void move() {
		System.out.println("�ٱ״�");
	}
	public void howl() {
		System.out.println("������");
	}
}

class Fox extends Animal{
	public Fox(String s) {
		super(s);
	}
	
	public void move() {
		System.out.println("��ӻ��");
	}
	public void howl() {
		System.out.println("�ƿ��");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Horse h = new Horse("Horsey");
		Fox f = new Fox("Foxy");
		
		h.move();
		h.howl();
		f.move();
		f.howl();

	}

}
