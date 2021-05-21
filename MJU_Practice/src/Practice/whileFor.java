package Practice;

public class whileFor {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);

		
		int sum2=0;
		int i=1;
		while(i<=10) {
			sum2+=i;
			i++;
		}
		System.out.println(sum2);
		
		for(int j=1; j<=10; j++) {
			if(j%3==0)continue;
			System.out.printf("%3d",j);
		}
	}

}
