package Week6;

public class Overloading {

	static int add(int a, int b) {
		return a+b;}
	// ���� �ΰ��� �Ǽ� �ϳ��� ���� ���� �����ϴ� �޼ҵ带 �����ε�
	static double add(int a, int b, double c) {
		return a+b+c;}
	
	public static void main(String[] args) {
		
	System.out.println(add(5,3));
	System.out.println(add(10,20,10.5));

	}

}
