package Week4;

public class Exam {
	
	int a,b;
	
	public int add(int a, int b){
		{return a+b;}
	}
	public double add(int a, int b, double c) {
		{return a+b+c;}
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		System.out.println(e.add(10, 20));
		System.out.println(e.add(10, 10,10.6));

	}

}
