package Week1;

public class ForWhileDemo {

	public static void main(String[] args) {
		//Q.1���� 10������ ���� ���Ͻÿ�.
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		//for�� ���
		int sum2=0;
		for(int j=1; j<=10; j++) {
			sum2+=j;
		}
		System.out.println(sum2);
	}

}
