package ��ü����_3;

public class Motocycle {

	boolean fuel_is_empty;
	int speed;
	
	public Motocycle() { //�ʱⰪ�� ���� ������ ����
	}
	
	public Motocycle(int a, boolean b){ //������
		this.speed = a;
		this.fuel_is_empty = b;
	}
	
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
		
			Motocycle m = new Motocycle(0,true); // ������
			Motocycle n = new Motocycle(); // �ʱⰪ�� ���� ���� ������ ȣ��
		//  m.speed = 0;
		//	m.fuel_is_empty = true;
			m.fillfuel();
			m.speedup(50);
			m.speedup(50);
			m.speeddown(100);
	}

}
