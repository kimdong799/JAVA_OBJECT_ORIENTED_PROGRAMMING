package 다중상속;

public class ChildClass extends ParentClass{
	
	String son, daughter; //멤버변수 생성
	
	public ChildClass() //생성자
	{
		//초기값 지정
//		this.son = "son";
//		this.daughter = "daughter";
		this("daughter", "son");
	}
	
	public ChildClass(String d, String s) {
		super("child.mother", "child.father");//두개의 인자값 갖는 생성자
		this.daughter = d; 
		this.son = s;
	}
	public String toString()
	{
		return super.father+"/"+super.mother+"/"+this.son+"/"+this.daughter;
	}
	
	public static void main(String[]args) {

		ChildClass child = new ChildClass();
		System.out.println(child.toString());
		
	}
}
