package WEEK4_Homework;

public abstract class Home_appliance {
	
	double battery; // 멤버변수
	
	public Home_appliance() { // 객체생성 후 멤버변수 초기화
		battery = 5;
	}
	
	public void charging(int time) {  // 일반메소드
		System.out.println("현재 전력 : "+battery+"%");
		this.battery += time*0.1;
		System.out.println(time+" 분 동안 충전하였습니다.");
		if (this.battery > 100) 
		{
			this.battery = 100;
		System.out.println("현재 충전량 : "+battery+"%");
		}
		else System.out.println("현재 충전량 : "+battery+"%");
	}
	
	public abstract void operate(); // 추상메소드
	
	public abstract void reserve_operate(int x); // 추상메소드

}
