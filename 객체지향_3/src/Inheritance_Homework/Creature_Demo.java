package Inheritance_Homework;

public class Creature_Demo {

	public static void main(String[] args) {
		
	//	Creature c = new Creature();
		Birds b = new Birds();
		reptile r = new reptile();
		Fish f = new Fish();

	/*	System.out.println("--------������ ���� Ư¡--------");
		c.breathe();
		c.have_spine();
		c.lay_eggs(); */
		System.out.println("--------������ Ư¡--------");
		b.breathe();
		b.have_spine();
		b.lay_eggs();
		b.have_wings=true;
		b.have_wing();
		b.fly();
		System.out.println("--------������� Ư¡--------");
		r.breathe();
		r.have_spine();
		r.lay_eggs();
		r.have_scales=true;
		r.have_scale();
		System.out.println("--------����� Ư¡--------");
		f.breathe(); //�������̵�
		f.have_spine();
		f.lay_eggs();
		f.liveInWater();
	}

}
