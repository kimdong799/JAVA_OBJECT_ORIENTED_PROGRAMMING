package OveridingTestClass;

public class Manager extends Employee {

	String jobId;
	
	public void OverridingTest() {
		System.out.println("사원의 이름은 "+name+"이고 나이는 "+age+"입니다.");
		System.out.println("그의 직업은 "+jobId+"입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		
		m.OverridingTest();
	}

}
