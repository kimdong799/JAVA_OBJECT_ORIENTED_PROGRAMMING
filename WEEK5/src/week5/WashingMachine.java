package week5;

public class WashingMachine extends Home_appliance{
	int wash_time;
	int dehydration;
	
	public void work() {
		System.out.println("��Ź�ϴ�.");
	}
	public void reserve(int r) {
		if(r==1)System.out.println("��Ź�� �����մϴ�.");
		if(r==2)System.out.println("Ż���� �����մϴ�.");
	}
}
