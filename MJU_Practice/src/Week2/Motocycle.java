package Week2;

public class Motocycle {
	
	boolean fuel_is_empty;
	int speed;

	public void fillfuel() {
		if (fuel_is_empty == true) {
			System.out.println("연료가 부족합니다.");
		}
		else {
			System.out.println("연료가 충분합니다.");
		}
	}
	public void speedup(int v) {
		this.speed += v;
		System.out.println("현재 속도: "+this.speed);
	}
	public void speeddown(int v) {
		this.speed -= v;
		System.out.println("현재 속도: "+this.speed);
	}
	
	public static void main(String[] args) {
		Motocycle m = new Motocycle();
		
		m.fuel_is_empty=false;
		m.fillfuel();
		m.speedup(70);
		m.speeddown(20);
	}

}
