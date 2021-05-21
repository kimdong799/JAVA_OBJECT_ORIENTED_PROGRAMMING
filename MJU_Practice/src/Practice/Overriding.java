package Practice;

class ship{
	
	int size;
	
	public ship() {}
	
	public ship(int size) {
		this.size=size;
	}
	
	public void printsize() {
		System.out.println(this.size);
	}
	public void drive() {
		System.out.println("순항하다.");
	}
}

class battleship extends ship{
	public battleship(int size) {
		super.size = size;
	}
	public void drive() {
		System.out.println("회항하다.");
	}
}

public class Overriding{

	public static void main(String[] args) {
		
		battleship s = new battleship(100);
		
		 s.printsize();
		 s.drive();
	}

}
