package 객체지향_3;

public class OverloadingTestClass {

	void OverloadingTest() {
		System.out.println("매개변수가 없는 메소드");
	}
	void OverloadingTest(int a)	{
		System.out.println("매개변수가"+a+"인 메소드");
	}
	void OverloadingTest(int a, int b)	{
		System.out.println("매개변수가"+a+"와"+b+"인 메소드");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
