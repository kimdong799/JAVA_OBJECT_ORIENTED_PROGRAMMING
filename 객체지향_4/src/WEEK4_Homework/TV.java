package WEEK4_Homework;

public class TV extends Home_appliance{
	
	int chanel;
	
	public TV() {
		this.chanel = 1;
	}
	
	public void operate() {
		System.out.println("TV�� ������ �׽��ϴ�.");
	}
	public void reserve_operate(int x) {
		
		if (x == 1) System.out.println("��󸶸� �����մϴ�.");
		else if (x == 2) System.out.println("��ȭ ��û���� �����մϴ�.");
		else System.out.println("�����Դϴ�.");
		}
	
}
