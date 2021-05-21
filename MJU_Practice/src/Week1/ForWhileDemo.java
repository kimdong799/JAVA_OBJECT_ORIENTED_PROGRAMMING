package Week1;

public class ForWhileDemo {

	public static void main(String[] args) {
		//Q.1부터 10까지의 합을 구하시오.
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		//for문 사용
		int sum2=0;
		for(int j=1; j<=10; j++) {
			sum2+=j;
		}
		System.out.println(sum2);
	}

}
