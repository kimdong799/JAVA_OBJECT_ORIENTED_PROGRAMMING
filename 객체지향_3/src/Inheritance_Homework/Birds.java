package Inheritance_Homework;

public class Birds extends Creature {
	
	boolean have_wings;
	
	public void have_wing()
	{	
	if(have_wings == true) 
		System.out.println("������ �ִ�.");
	}
	
	public void fly() {
		System.out.println("�ϴ��� ����.");
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
