package Inheritance_Homework;

public class reptile extends Creature{

	boolean have_scales;
	public void have_scale() {
		if (have_scales == true) System.out.println("비늘을 가지고있다.");
	}
	public void breathe() {
		System.out.println("호흡을 한다.");
	}
	
	public void have_spine() {
		System.out.println("척추가 있다.");
	}
	
	public void lay_eggs() {
		System.out.println("알을 낳는다.");
	}
}
