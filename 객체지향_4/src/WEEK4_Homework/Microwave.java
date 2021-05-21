package WEEK4_Homework;

public class Microwave extends Home_appliance{

	int weight;
	
	public Microwave() {
		weight = 10;
	}
	public void operate() {
		System.out.println("전자레인지가 작동됩니다.");
	}
	public void reserve_operate(int x) {
		
		if (x == 1) System.out.println("해동 모드를 시작합니다.");
		else if (x == 2) System.out.println("계란찜 모드를 시작합니다.");
		else System.out.println("오류입니다.");
	}
	
}
