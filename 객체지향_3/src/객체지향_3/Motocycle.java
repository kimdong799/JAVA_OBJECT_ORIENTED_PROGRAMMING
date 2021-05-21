package 객체지향_3;

public class Motocycle {

	boolean fuel_is_empty;
	int speed;
	
	public Motocycle() { //초기값이 없는 생성자 생성
	}
	
	public Motocycle(int a, boolean b){ //생성자
		this.speed = a;
		this.fuel_is_empty = b;
	}
	
	void fillfuel()
	{
		if(fuel_is_empty == true)System.out.println("연료부족");
		else System.out.println("연료충분");
		this.fuel_is_empty = false;
		System.out.println("연료충분");
	}
	
	void speedup(int v)
	{
		this.speed+=v;
		System.out.println("현재속도는 "+this.speed);
	}
	void speeddown(int v)
	{
		this.speed-=v;
		System.out.println("현재속도는 "+this.speed);
	}
	public static void main(String[] args) {
		
			Motocycle m = new Motocycle(0,true); // 생성자
			Motocycle n = new Motocycle(); // 초기값을 주지 않은 생성자 호출
		//  m.speed = 0;
		//	m.fuel_is_empty = true;
			m.fillfuel();
			m.speedup(50);
			m.speedup(50);
			m.speeddown(100);
	}

}
