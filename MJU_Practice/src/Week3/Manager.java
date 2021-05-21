package Week3;

public class Manager extends Employee{

	String JobID;
	
	public void overridingTest()  {
		System.out.println("사원의 이름은 "+name+"이고 나이는 "+age+"입니다.");
		System.out.println("그의 직업은 "+JobID+"입니다.");
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		
		e.overridingTest("김동현",24);
		m.overridingTest();
	}

}
