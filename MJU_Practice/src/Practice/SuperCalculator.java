package Practice;

class calculator{
	int x, y;
	
	public calculator() {}
	
	public calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void sum() {
		System.out.println(this.x+this.y);
	}
}
class subcalculator extends calculator{
	public subcalculator(int x, int y) {
		super(x,y);
	}
	public void sub() {
		System.out.println(this.x-this.y);
	}
}

class avgcalculator extends subcalculator{
	public avgcalculator(int x, int y) {
		super(x,y);
	}
	public void avg() {
		System.out.println((this.x+this.y)/2);
	}
}
public class SuperCalculator {

	public static void main(String[] args) {
		avgcalculator a = new avgcalculator(10,20);
		a.avg();
		a.sub();
		a.sum();

	}

}
