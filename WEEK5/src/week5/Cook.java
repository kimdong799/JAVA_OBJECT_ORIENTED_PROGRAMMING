package week5;

public class Cook extends Home_appliance{
	int cook_time;
	String kind_rice;
	
	public void work() {
		System.out.println("����ϴ�.");
	}
	
	public void reserve(int r) {
		if(r==1)System.out.println("��縦 �����մϴ�.");
		if(r==2)System.out.println("������ �����մϴ�.");
	}
}
