package CodingTest;
import java.util.Scanner;

// 소수를 출력하는 메소드

public class Prime {
	
	    public int solution(int n) {
	        int answer = 0;
	        boolean isPrime;
	        for(int i=2;i<=n;i++){
	            isPrime=true;
	            for(int j=2; j<i; j++){
	                if(i%j==0){
	                    isPrime=false;
	                }
	            }
	            if(isPrime==true){
	                answer++;
	                System.out.println(i);
	            }
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prime p = new Prime();
		int num;
		num = sc.nextInt();
		p.solution(num);
		
	}

}
