package Week5;

public class Coin {

	public static void main(String[] args) {
		
		// Q1.50�ۼ�Ʈ Ȯ���� 0�̳� 1�� �������� �ϼ���
		
		int sum = 0;
		for(int i=0; i<10000; i++) {
			double r = Math.random()+0.5; // 0.5���� 1.5������ ���� �߻�.
			sum += r;  // ������ ������ sum�� r�� ����.
		}
		System.out.println(sum);
		System.out.println("1�� ���� Ȯ�� :"+sum/100+"%");
		
		// Q2. 70�ۼ�Ʈ Ȯ���� 1�� �������� �Ϸ���?
		int a;
		int sum2 = 0;
		for(int i=0; i<10000; i++) {
			double r2 = Math.random();
			if(r2<=0.7) a=1;
			else a=0;
			sum2+=a;
		}
		System.out.println("1�� ���� Ȯ�� : "+sum2/100+"%");
		
		// Q3. �ֻ���ó�� 6���� ���ڰ� �������� �Ϸ���??
		
		int b;
		int dice;
		double r3;
		r3 = Math.random()*6+1; // 0.1 ~ 6.99 ���� ��ȯ.
		dice = (int)r3;
		System.out.println("�ֻ����� �����ϴ�."+dice);
		
	}

}
