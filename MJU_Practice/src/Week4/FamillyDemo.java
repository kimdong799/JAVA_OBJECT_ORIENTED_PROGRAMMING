package Week4;

class Parent{
	String mother, father;
	
	public Parent(){
		this.mother = "mother";
		this.father = "father";
	}
	
	public Parent(String f, String m) {
		this.father = f;
		this.mother = m;
	}
	
	public String toString() {
		String r = father+mother;
		return r;
	}
}
	
class Child extends Parent{
	String Son, Daughter;
	
//	public Child() {
//		this.Son = "Son";
//		this.Daughter = "Daughter";
//	}
//	public Child(String s, String d) {
//		super("Child.Mother","Child.Father");
//		this.Son = s;
//		this.Daughter = d;
//	}
	public String toString()
	{
		return super.father+"/"+super.mother+"/"+this.Son+"/"+this.Daughter;
	}
	
}

public class FamillyDemo {
	
	public static void main(String[] args) {
		Child c = new Child();
//		Child c2 = new Child("±è","È«");
		System.out.println(c.toString());
//		System.out.println(c2.toString());

	}

}
