package ��ü����_1;

public class ��ü����_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� r�� �����ϰ� 0.5 �̻��̸� ����Ͻÿ�.
		
		double r;
		r = Math.random();
		if(r > 0.5) System.out.println(r);
		
		//���� �ϳ��� �����Ͽ� 0.5�̻��̸� 0.5�̻��� ���
		//0.5 �̸��̸� 0.5�̸��� ���
		
		double a;
		a = Math.random();
		if (a >= 0.5) System.out.println(a+"�� 0.5�̻��Դϴ�.");
		else System.out.println(a+"�� 0.5 �̸��Դϴ�.");
		
		//while�� (�ݺ���)
		
		int i=0;
		while(i<10) {
			System.out.println("Hello" + i);
			++i;
		}
		
		//for�� [for (�ʱ�����; �ݺ�����; �ݺ�����) {
		
		for(int b=0; b<10; b++) {
			System.out.println("Hello"+b);
		}
		
		// 1���� 10������ ���� ���Ͻÿ�(while/for)
		int q = 1;
		int sum = 0;
		while(q <= 10) {
			System.out.println(q);
			sum += q;
			q++;
		}
		System.out.println(sum);
		
		int sum2=0;
		for(int w=0; w<=10; w++) {
			System.out.println(w);
			sum2 += w;
		}
			System.out.println(sum2);
		
		//break �� continue
		//break:�ݺ��� �ߴ�, continue:���� ����, �ݺ� �簳
			
			for(int c=0; c<10; ++c) {
				if(c==4)break;
				System.out.println(c);
			}
			
			for(int d=0; d<10; ++d) {
				if(d==4)continue;
				System.out.println(d);
			}
			//1���� 10������ ���� �μ��ϴٰ� 3�� ����� �Ǹ� �ǳ� �ٽÿ�.
			//(for, continue)
			for(int e=0; e<10; e++) {
				if(e%3==0)continue;
				System.out.println(e);
			}
		}
	}

