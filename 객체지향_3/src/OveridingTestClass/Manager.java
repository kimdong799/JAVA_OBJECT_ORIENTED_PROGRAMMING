package OveridingTestClass;

public class Manager extends Employee {

	String jobId;
	
	public void OverridingTest() {
		System.out.println("����� �̸��� "+name+"�̰� ���̴� "+age+"�Դϴ�.");
		System.out.println("���� ������ "+jobId+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		
		m.OverridingTest();
	}

}
