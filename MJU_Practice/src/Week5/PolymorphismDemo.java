package Week5;

interface I2{
	public String A();
}

interface I3{
	public String B();
}

class C implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		C obj = new C();
		I2 objI2 = new C();
		I3 objI3 = new C();
		
		obj.A();
		obj.B();
		
		objI2.A();
//		objI2.B();
	}

}
