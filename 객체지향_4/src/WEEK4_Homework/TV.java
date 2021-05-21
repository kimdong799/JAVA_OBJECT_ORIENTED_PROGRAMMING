package WEEK4_Homework;

public class TV extends Home_appliance{
	
	int chanel;
	
	public TV() {
		this.chanel = 1;
	}
	
	public void operate() {
		System.out.println("TV의 전원을 켰습니다.");
	}
	public void reserve_operate(int x) {
		
		if (x == 1) System.out.println("드라마를 예약합니다.");
		else if (x == 2) System.out.println("영화 시청권을 구매합니다.");
		else System.out.println("오류입니다.");
		}
	
}
