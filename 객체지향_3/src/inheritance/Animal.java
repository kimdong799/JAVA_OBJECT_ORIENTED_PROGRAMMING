package inheritance;

public class Animal extends Creature {
	int num_of_legs;{
	System.out.println("움직이다");	
	}
	public void breathe() {
		System.out.println("산소를 받아들이다."); //오버라이딩
	}
}
