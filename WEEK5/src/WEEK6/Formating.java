package WEEK6;

public class Formating {

	public static void main(String[] args) {
		
		System.out.println(String.format("%d + %d �� %d �Դϴ�.",10, 20, 30));
		System.out.printf("%d + %d = %d�Դϴ�.", 10,20,30);
		System.out.println();
		System.out.printf("%5d, %-8s, %10f", 10,"�ȳ�", 3.5);
		//�÷��� '-' ���� ����, ������ ������ ����
		//
		System.out.println();
		System.out.printf("%5s", "��"); //�ѱ��� ���ڸ� ��Ƹ���
		System.out.println();
		System.out.printf("%-5s", "a");
		
		System.out.println();
		
		//���ڰ� ��� X
		System.out.printf("%s %s %s\n", "Name", "Total", "Avg");
		System.out.printf("%s %d %f\n", "Jones",950,80.2436);
		System.out.printf("%s %d %f\n", "Toms", 1050, 90.43);
		
		System.out.println();
		// �����ؼ� ���  %8.2 �� ��ü 8�ڸ� �� �Ҽ��� 2�ڸ� ����Ѵٴ� ��
		System.out.printf("%-8s %8s %8.2s\n", "Name", "Total", "Avg");
		System.out.printf("%-8s %8d %8.2f\n", "Jones",950,80.2436);
		System.out.printf("%-8s %8d %8.2f\n", "Toms", 1050, 90.43);
		// ��µ� ���� �� ���� ������ ���� ������ �߸��°� �ƴ϶� �׳� ��ü ��µ�.
		
		//�ڸ��� ������ �� ���� ��� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ������: %d%n",1);
		System.out.printf("�ڸ��� ������: %d%n",10);
		System.out.printf("�ڸ��� ������: %d%n",100);
		System.out.printf("�ڸ��� ������: %d%n",1000);
		
		//�ڸ��� �������� ��� ���������� ����(���� �ڸ��� ����)
		System.out.printf("�ڸ��� ����: %4d%n",1);
		System.out.printf("�ڸ��� ����: %4d%n",10);
		System.out.printf("�ڸ��� ����: %4d%n",100);
		System.out.printf("�ڸ��� ����: %4d%n",1000);
		
		//�ڸ��� ���� �� '-'�� ����ϸ� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n", 1);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n", 10);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n", 100);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n", 1000);
		
		//�ڸ��� ���� �� '0' ����ϸ� ���������� ���ĵȴ�. (���� �ڸ����� 0���� ä���.)
		System.out.printf("�ڸ��� ����('0'���) :%04d%n", 1);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n", 10);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n", 100);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n", 1000);
	}

}
