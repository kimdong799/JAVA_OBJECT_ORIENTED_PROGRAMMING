package ���߻��;

public class ParentClass {
	String mother; //�������
	String father; //�������

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
