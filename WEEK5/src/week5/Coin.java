package week5;

public class Coin {

	public static void main(String[] args) {

		// 0�̳� 1�� 50% �� Ȯ���� �������� �Ͻÿ�!
		int sum = 0;
		int A = (int)(Math.random()+0.5);
		System.out.println(A);
		
		for(int i=0; i<10000; i++) {
			int a = (int)(Math.random()+0.5);
			sum = sum+a;
		}
		System.out.println("1�� ���� Ȯ��:"+sum/100+"%");
		
		int sum2 = 0;
		int b;
		for(int i=0; i<10000; i++) {
			if(Math.random()>=0.5) b=1;
			else b=0;
			sum2 = sum2+b;
		}
		System.out.println("1�� ���� Ȯ��:"+sum2/100+"%");
		
		// 0�� 1�� 1�� 70%�� Ȯ���� �������� �Ϸ���??
		
		int sum3=0;
		int c;
		
		for(int i=0; i<10000; i++) {
			if(Math.random()>=0.3)c=1;
			else c=0;
			sum3 = sum3+c;
		}
		System.out.println("1�� ���� Ȯ��"+sum3/100+"%");
		
		// �ֻ���ó�� 1~6�� ������ ������ �Ϸ���??
		
		int d;
		d = (int)(Math.random()*6)+1;
		System.out.println("�ֻ����� �����ϴ� : "+d);
	}

}
