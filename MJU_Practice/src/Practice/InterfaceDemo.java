package Practice;

interface Walkable{
	
	public static final boolean can_walk=true;
	
	public abstract void walk();
}

interface Swimmable{
	
	public static final boolean can_swim=true;
	
	public abstract void swim();
}

public class InterfaceDemo implements Walkable, Swimmable{
	
	public void walk() {
		System.out.println("수영하다.");
	}
	public void swim() {
		System.out.println("걷다.");
	}

	public static void main(String[] args) {
		InterfaceDemo i = new InterfaceDemo();
		
		i.walk();
		i.swim();
	}

}
