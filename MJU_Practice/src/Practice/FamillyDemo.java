package Practice;

class Parent{
	String mother, father; //��� ����
	
	public Parent() {} // �⺻ ������.
	
	public Parent(String m, String f) { // ���ڰ��� �޾� ������� ���� �ʱ�ȭ�ϴ� ������.
		this.mother = m;
		this.father = f;
	}
	public String parentname() { // �θ��� �̸��� ��ȯ�ϴ� �޼ҵ�
		String r= this.mother+"/"+this.father;
		return r;
	}
}
class Child extends Parent{ // parent Ŭ������ ��ӹ޴� child Ŭ����
	String son, daughter; // �������
	
	public Child(String s, String d) {
		super("child.mother","child.father"); // ����Ŭ���� ��� �ʱ�ȭ
		this.son = s;
		this.daughter = d;
	}
	public void famillyname() {
		System.out.println(super.father+"/"+super.mother+"/"+this.son+"/"+this.daughter);
	}
	
	
}
public class FamillyDemo {

	public static void main(String[] args) {
		Child c = new Child("��","ȫ");
		c.famillyname();
	}

}
