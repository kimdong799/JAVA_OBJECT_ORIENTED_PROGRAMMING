package Week1;

public class Random {

	public static void main(String[] args) {
		//Q.���� �ϳ��� �����Ͽ� 0.5 �̻��̸� "0.5 �̻�" �� ����ϴ� ���ǹ��� �ۼ��Ͻÿ�.
		double r=Math.random();
		if(r>0.5) {
			System.out.println("0.5�̻�");
		}
		//Q.���� �ϳ��� �����Ͽ� 0.5���� �̻��̸� "0.5 �̻�"�� ����ϰ� 05 �̸��̸� "0.5 �̸�"�� ����Ͻÿ�.
		double t=Math.random();
		if(r<=0.5) {
			System.out.println("0.5�̻�");
		}
		else {
			System.out.println("0.5�̸�");
		}
	}

}
