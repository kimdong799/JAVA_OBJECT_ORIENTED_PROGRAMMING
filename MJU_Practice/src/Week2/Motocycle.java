package Week2;

public class Motocycle {
	
	boolean fuel_is_empty;
	int speed;

	public void fillfuel() {
		if (fuel_is_empty == true) {
			System.out.println("���ᰡ �����մϴ�.");
		}
		else {
			System.out.println("���ᰡ ����մϴ�.");
		}
	}
	public void speedup(int v) {
		this.speed += v;
		System.out.println("���� �ӵ�: "+this.speed);
	}
	public void speeddown(int v) {
		this.speed -= v;
		System.out.println("���� �ӵ�: "+this.speed);
	}
	
	public static void main(String[] args) {
		Motocycle m = new Motocycle();
		
		m.fuel_is_empty=false;
		m.fillfuel();
		m.speedup(70);
		m.speeddown(20);
	}

}
