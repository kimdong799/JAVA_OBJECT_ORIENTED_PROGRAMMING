package WEEK4_Homework;

public class Microwave extends Home_appliance{

	int weight;
	
	public Microwave() {
		weight = 10;
	}
	public void operate() {
		System.out.println("���ڷ������� �۵��˴ϴ�.");
	}
	public void reserve_operate(int x) {
		
		if (x == 1) System.out.println("�ص� ��带 �����մϴ�.");
		else if (x == 2) System.out.println("����� ��带 �����մϴ�.");
		else System.out.println("�����Դϴ�.");
	}
	
}
