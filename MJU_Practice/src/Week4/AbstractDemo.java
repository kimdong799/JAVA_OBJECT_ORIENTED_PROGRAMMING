package Week4;

abstract class A{ // �߻�Ŭ����
	public abstract int b(); //�߻� �޼ҵ� , ��ü���� ������ �������̵��Ͽ� �����ؾߵ�.
	
	public void d() { // �߻� Ŭ�����ȿ� �߻�޼ҵ尡 �ƴ� �Ϲ� �޼ҵ嵵 ������ �� ����.
		System.out.println("HELLO JAVA");
	}
}

class B extends A{ // �߻�޼ҵ带 ����ϱ� ���ؼ� �ݵ�� �߻�Ŭ������ ����ؾ���.
	public int b() { // �߻�޼ҵ带 ����ϱ� ���ؼ� �ݵ�� �������̵��ؼ� ��ü���� ������ �ۼ��ؾ���.
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
		obj.d();

	}

}
