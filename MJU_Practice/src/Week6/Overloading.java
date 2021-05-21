package Week6;

public class Overloading {

	static int add(int a, int b) {
		return a+b;}
	// 정수 두개와 실수 하나를 더한 합을 리턴하는 메소드를 오버로딩
	static double add(int a, int b, double c) {
		return a+b+c;}
	
	public static void main(String[] args) {
		
	System.out.println(add(5,3));
	System.out.println(add(10,20,10.5));

	}

}
