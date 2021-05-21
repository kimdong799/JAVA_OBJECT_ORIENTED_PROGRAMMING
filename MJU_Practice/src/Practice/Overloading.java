package Practice;

public class Overloading {
	
	int add(int a, int b) {
		return a+b;
	}
	double add(int a, int b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Overloading O = new Overloading();
		
		System.out.println(O.add(10, 20));
		System.out.println(O.add(10, 20,10.5));

	}

}
