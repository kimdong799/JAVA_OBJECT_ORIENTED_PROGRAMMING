package Week3;

public class Overloading {
	
	public void same(int a) {
		System.out.println("������ �Է��߽��ϴ�.");
	}
	public void same(int a, int b) {
		System.out.println("���� �ΰ��� �Է��߽��ϴ�.");
	}
	public void same(double b) {
		System.out.println("�Ǽ��� �Է��߽��ϴ�.");
	}
	public void same(String c) {
		System.out.println("���ڿ��� �Է��߽��ϴ�.");
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.same(1);
		o.same(1,2);
		o.same(2.4);
		o.same("�����ε� ����");

	}

}
