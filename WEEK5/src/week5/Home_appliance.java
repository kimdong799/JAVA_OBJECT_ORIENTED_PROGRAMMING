package week5;

public abstract class Home_appliance {
	
	double battery = 0;
	
	public void show_battery() {
		System.out.println("���͸���"+(int)battery+"% ���ҽ��ϴ�.");
	}
	public void charge_battery(double time) {
		battery=battery+(time * 10);
		if (battery>100)battery=100;
	}
	
	public abstract void work();
	public abstract void reserve(int r);
}
