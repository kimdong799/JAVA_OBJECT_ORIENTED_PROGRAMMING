package 객체지향_1;

public class 객체지향_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 r을 생성하고 0.5 이상이면 출력하시오.
		
		double r;
		r = Math.random();
		if(r > 0.5) System.out.println(r);
		
		//난수 하나를 생성하여 0.5이상이면 0.5이상을 출력
		//0.5 미만이면 0.5미만을 출력
		
		double a;
		a = Math.random();
		if (a >= 0.5) System.out.println(a+"는 0.5이상입니다.");
		else System.out.println(a+"는 0.5 미만입니다.");
		
		//while문 (반복문)
		
		int i=0;
		while(i<10) {
			System.out.println("Hello" + i);
			++i;
		}
		
		//for문 [for (초기조건; 반복조건; 반복실행) {
		
		for(int b=0; b<10; b++) {
			System.out.println("Hello"+b);
		}
		
		// 1부터 10까지의 합을 구하시오(while/for)
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
		
		//break 와 continue
		//break:반복문 중단, continue:실행 중지, 반복 재개
			
			for(int c=0; c<10; ++c) {
				if(c==4)break;
				System.out.println(c);
			}
			
			for(int d=0; d<10; ++d) {
				if(d==4)continue;
				System.out.println(d);
			}
			//1부터 10까지의 수를 인쇄하다가 3의 배수가 되면 건너 뛰시오.
			//(for, continue)
			for(int e=0; e<10; e++) {
				if(e%3==0)continue;
				System.out.println(e);
			}
		}
	}

