package Inheritance_Homework;

public class Birds extends Creature {
	
	boolean have_wings;
	
	public void have_wing()
	{	
	if(have_wings == true) 
		System.out.println("날개가 있다.");
	}
	
	public void fly() {
		System.out.println("하늘을 날다.");
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
