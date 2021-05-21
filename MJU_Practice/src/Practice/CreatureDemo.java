package Practice;

class Creature{
	int size;
	void breathe() {
		System.out.println("숨쉬다.");
	}
}
class Animal extends Creature{
	int num_of_legs;
	void move() {
		System.out.println("움직이다.");
	}
}
class Plant extends Creature{
	boolean is_monoecious;
	void photosythsize() {
		System.out.println("광합성하다.");
	}
}
public class CreatureDemo {

	public static void main(String[] args) {
		Animal a = new Animal();
		Plant p = new Plant();
		
		a.move();
		a.breathe();

	}

}
