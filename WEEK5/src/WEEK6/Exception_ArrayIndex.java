package WEEK6;
 // �迭�� ������ ��� ���!
public class Exception_ArrayIndex {

	public static void main(String[] args) {
		int c[] = new int[5];
		
		try {
		for(int i=0; i<10; ++i) {
			System.out.println(i);
			c[i] = i;
		}
		}catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("�迭�� ������ ������ϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}
