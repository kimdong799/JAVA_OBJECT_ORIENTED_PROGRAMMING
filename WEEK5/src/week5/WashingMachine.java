package week5;

public class WashingMachine extends Home_appliance{
	int wash_time;
	int dehydration;
	
	public void work() {
		System.out.println("세탁하다.");
	}
	public void reserve(int r) {
		if(r==1)System.out.println("세탁을 예약합니다.");
		if(r==2)System.out.println("탈수를 예약합니다.");
	}
}
