package week5;

public class Abstract_Demo {

	public static void main(String[] args) {
		
		Cook c = new Cook();
		
		c.charge_battery(5);
		c.show_battery();
		c.work();
		c.reserve(1);
		
		WashingMachine m = new WashingMachine();
		
		m.charge_battery(3);
		m.show_battery();
		m.work();
		m.reserve(2);
		
		
	}

}
