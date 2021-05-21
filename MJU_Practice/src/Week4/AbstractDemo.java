package Week4;

abstract class A{ // 추상클래스
	public abstract int b(); //추상 메소드 , 구체적인 로직은 오버라이딩하여 정의해야됨.
	
	public void d() { // 추상 클래스안에 추상메소드가 아닌 일반 메소드도 존재할 수 있음.
		System.out.println("HELLO JAVA");
	}
}

class B extends A{ // 추상메소드를 사용하기 위해선 반드시 추상클래스를 상속해야함.
	public int b() { // 추상메소드를 사용하기 위해선 반드시 오버라이딩해서 구체적인 로직을 작성해야함.
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
		obj.d();

	}

}
