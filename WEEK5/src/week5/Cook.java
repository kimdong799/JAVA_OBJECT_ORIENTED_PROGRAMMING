package week5;

public class Cook extends Home_appliance{
	int cook_time;
	String kind_rice;
	
	public void work() {
		System.out.println("취사하다.");
	}
	
	public void reserve(int r) {
		if(r==1)System.out.println("취사를 예약합니다.");
		if(r==2)System.out.println("보온을 예약합니다.");
	}
}
