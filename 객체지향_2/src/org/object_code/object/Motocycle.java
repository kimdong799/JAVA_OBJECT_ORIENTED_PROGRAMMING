package org.object_code.object;

public class Motocycle {

	boolean fuel_is_empty;
	int speed;
	
	void fillfuel()
	{
		if(fuel_is_empty == true)System.out.println("�������");
		else System.out.println("�������");
		this.fuel_is_empty = false;
		System.out.println("�������");
	}
	
	void speedup(int v)
	{
		this.speed+=v;
		System.out.println("����ӵ��� "+this.speed);
	}
	void speeddown(int v)
	{
		this.speed-=v;
		System.out.println("����ӵ��� "+this.speed);
	}
	
	public static void main(String[] args) {
		Motocycle m = new Motocycle();
		
		m.fuel_is_empty = true;
		m.fillfuel();
		m.speedup(50);
		m.speedup(50);
		m.speeddown(100);
		

	}

}
