package CodingTest;

public class Prime3 {
	
	int numofprime(int n) {
		int result = 0;

		for(int i=2; i<=n; i++) {
			boolean flag = true;
			for(int j=2; j<i; j++) {
				if(i%j==0)
					flag=false;
			}
			if(flag==true)
				System.out.print(i+" ");
				result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Prime3 p = new Prime3();
		
		System.out.println(p.numofprime(10));
	}

}
