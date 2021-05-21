package Practice;

abstract class appliance{
	
	int battery;

	public void charge(int time) {
		this.battery = (int)(time*0.1);
		if(battery>=100)battery=100;
		System.out.println(this.battery+"%");
	}
	abstract void operate();
	
	abstract void reserve(int num);
}

public class Homeappliance extends appliance{
	
	public void operate() {
		System.out.println("작동합니다.");
	}
	
	public void reserve(int num) {
		if(num==1)System.out.println("1번을 실행합니다.");
		else if(num==2)System.out.println("2번을 실행합니다.");
		else System.out.println("오류입니다.");
	}
	
	public static void main(String[] args) {
		Homeappliance h = new Homeappliance();
		
		h.charge(2200);
		h.operate();
		h.reserve(1);

	}

}
