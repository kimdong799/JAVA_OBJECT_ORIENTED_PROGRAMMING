package Week4;

abstract class Human{
	
	String name;
	
	public Human() {} // �⺻������
	
	public Human(String name) { //���ڰ��� �ִ� ������.
		this.name = name;
	}
// �ڽ�Ŭ������ �θ� Ŭ������ �Ű������� �ִ� �����ڸ� ȣ���� �� ���� �⺻�����ڸ� ���������Ѵ�.
	// ���� ���� Ŭ�������� ���� ������ �����ڸ� ����ٸ� �̴� �ߺ��� �߻��ϹǷ� ���� ������ �߱��Ѵ�. ���� ����ϴ°��� super�̴�.

	abstract void move();
	
	abstract void cry();
	
}

class Baby extends Human {
	
	public void move(){
		System.out.println("���ݾ���");
	}
	public void cry() {
		System.out.println("��������");
	}
}

class Adult extends Human{
	
	public Adult(String name) {
		super.name = name; 
	}
	public void move(){
		System.out.println(name+": ��������");
	}
	public void cry() {
		System.out.println("����");
	}
}

public class HumanDemo {

	public static void main(String[] args) {
		
		Baby b = new Baby();
		Adult a = new Adult("�赿��");
		
		b.cry();
		b.move();
		a.cry();
		a.move();
	}

}
