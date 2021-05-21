package 다중상속;

public class ParentClass {
	String mother; //멤버변수
	String father; //멤버변수

	public ParentClass(String m, String f)
	{
		this.mother = m;
		this.father = f;
	}
	
	public ParentClass()
	{
		mother = "mother";
		father = "father";
	}
	
	public String toString()
	{
		String r = father+"/"+mother;
		return r;
	}
}
