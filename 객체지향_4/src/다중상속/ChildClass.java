package ���߻��;

public class ChildClass extends ParentClass{
	
	String son, daughter; //������� ����
	
	public ChildClass() //������
	{
		//�ʱⰪ ����
//		this.son = "son";
//		this.daughter = "daughter";
		this("daughter", "son");
	}
	
	public ChildClass(String d, String s) {
		super("child.mother", "child.father");//�ΰ��� ���ڰ� ���� ������
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
