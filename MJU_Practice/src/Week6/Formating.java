package Week6;

public class Formating {

	public static void main(String[] args) {
		
		System.out.println(String.format("%s�� �ʹ� ���ŷӽ��ϴ�.", "�� ���"));
		System.out.printf("���� %s %s ����� ��ȣ�մϴ�.\n","������","��� �� ��");
		//%s �� ���ڿ�, %d�� ������
		System.out.printf("%d + %d �� %d �Դϴ�.\n",10, 20, 30);
		
		System.out.printf("%5d, %-8s, %10.3f\n",10,"�ȳ�",3.5);
		
		// �ڸ��� ���� ����. ���� ���ĵ�.
		System.out.printf("�ڸ��� ������:%d\n",1);
		System.out.printf("�ڸ��� ������:%d\n",10);
		System.out.printf("�ڸ��� ������:%d\n",100);
		System.out.printf("�ڸ��� ������:%d\n",1000);
	
		//�ڸ��� �����ϸ� ������ ����
		System.out.printf("�ڸ��� ����:%5d\n",1);
		System.out.printf("�ڸ��� ����:%5d\n",10);
		System.out.printf("�ڸ��� ����:%5d\n",100);
		System.out.printf("�ڸ��� ����:%5d\n",1000);
		
		//�ڸ��� ���� �� '-' ����ϸ� ���� ����
		System.out.printf("�ڸ��� ����(-)���:%-5d\n", 1);
		System.out.printf("�ڸ��� ����(-)���:%-5d\n", 10);
		System.out.printf("�ڸ��� ����(-)���:%-5d\n", 100);
		System.out.printf("�ڸ��� ����(-)���:%-5d\n", 1000);
		
		//�ڸ��� ���� �� '0' ����ϸ� ������ ����
		System.out.printf("�ڸ��� ����(0)���:%05d\n",1);
		System.out.printf("�ڸ��� ����(0)���:%05d\n",10);
		System.out.printf("�ڸ��� ����(0)���:%05d\n",100);
		System.out.printf("�ڸ��� ����(0)���:%05d\n",1000);
		
		
	}

}
