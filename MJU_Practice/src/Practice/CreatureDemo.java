package Practice;

class Creature{
	int size;
	void breathe() {
		System.out.println("������.");
	}
}
class Animal extends Creature{
	int num_of_legs;
	void move() {
		System.out.println("�����̴�.");
	}
}
class Plant extends Creature{
	boolean is_monoecious;
	void photosythsize() {
		System.out.println("���ռ��ϴ�.");
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
