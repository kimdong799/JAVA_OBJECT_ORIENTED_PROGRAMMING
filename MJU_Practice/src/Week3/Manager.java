package Week3;

public class Manager extends Employee{

	String JobID;
	
	public void overridingTest()  {
		System.out.println("����� �̸��� "+name+"�̰� ���̴� "+age+"�Դϴ�.");
		System.out.println("���� ������ "+JobID+"�Դϴ�.");
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		
		e.overridingTest("�赿��",24);
		m.overridingTest();
	}

}
