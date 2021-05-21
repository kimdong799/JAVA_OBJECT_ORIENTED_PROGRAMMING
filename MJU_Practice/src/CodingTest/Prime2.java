package CodingTest;
import java.util.Scanner;

public class Prime2 {

	    public int solution(int n) {
	        int answer = 0;
	        boolean [] sosu = new boolean[n+1];
	        
	        for(int i=2; i<=n; i++)
	            sosu[i]=true; // 2~n번째수를 true를 초기화.
	        //제곱근 구하기
	        int root=(int)Math.sqrt(n);
	        
	        for(int i=2; i<=root; i++){//2~루트n까지 검사
	            if(sosu[i]==true){
	                for(int j=i; i*j<=n; j++)
	                    sosu[i*j]=false;
	            }
	        }
	        for(int i=2; i<=n; i++){
	            if(sosu[i]==true)
	                answer++;
	        }
	        return answer;
	    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prime2 p = new Prime2();
		
		int s = sc.nextInt();
		System.out.println(p.solution(s));

	}

}
