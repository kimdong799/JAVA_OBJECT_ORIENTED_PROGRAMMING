package Week5;

interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface beilever{}

class Steve implements father, programmer, beilever{
	public void coding() {
		System.out.println("fast");//�ڵ��̶�� �޼ҵ��� ������ ����
	}
}
class Rachel implements mother, programmer{
	public void coding() {
		System.out.println("elegance");// �ڵ��̶�� �޼ҵ��� ������ ����
	}
}

public class Workspace {

	public static void main(String[] args) {
		programmer employee1 = new Steve();//������ Ÿ���� ���α׷���, ���α׷����� �޼ҵ常 ��밡��
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();

	}

}
