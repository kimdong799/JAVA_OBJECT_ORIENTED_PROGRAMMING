package Inheritance_Homework;

public class reptile extends Creature{

	boolean have_scales;
	public void have_scale() {
		if (have_scales == true) System.out.println("����� �������ִ�.");
	}
	public void breathe() {
		System.out.println("ȣ���� �Ѵ�.");
	}
	
	public void have_spine() {
		System.out.println("ô�߰� �ִ�.");
	}
	
	public void lay_eggs() {
		System.out.println("���� ���´�.");
	}
}
