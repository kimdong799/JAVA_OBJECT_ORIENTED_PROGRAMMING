package Inheritance_Homework;

public class Creature_Demo {

	public static void main(String[] args) {
		
	//	Creature c = new Creature();
		Birds b = new Birds();
		reptile r = new reptile();
		Fish f = new Fish();

	/*	System.out.println("--------생물의 공통 특징--------");
		c.breathe();
		c.have_spine();
		c.lay_eggs(); */
		System.out.println("--------조류의 특징--------");
		b.breathe();
		b.have_spine();
		b.lay_eggs();
		b.have_wings=true;
		b.have_wing();
		b.fly();
		System.out.println("--------파충류의 특징--------");
		r.breathe();
		r.have_spine();
		r.lay_eggs();
		r.have_scales=true;
		r.have_scale();
		System.out.println("--------어류의 특징--------");
		f.breathe(); //오버라이딩
		f.have_spine();
		f.lay_eggs();
		f.liveInWater();
	}

}
