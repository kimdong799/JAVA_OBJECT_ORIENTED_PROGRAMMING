package Week3;

public class Employee {
	String name;
	int age;
	
	public void overridingTest(String name, int age) {
		this.age =age;
		this.name = name;
		System.out.println("����� �̸�: "+name+"\n����� ����: "+age);
	}

}
