package FinalPractice;

interface walkable{
	
	final int legs=2;
	
	public abstract void walk();
}
interface flyable{
	
	final int size_of_wings=2;
	
	public abstract void fly();
}
public class Chicken implements walkable, flyable{
	public void walk() {
		System.out.println("�Ĵٴ�");
	}
	public void fly() {
		System.out.println("�Ĵ��Ĵ�");
	}

	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.walk();
		c.fly();

	}

}
