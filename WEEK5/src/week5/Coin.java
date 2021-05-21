package week5;

public class Coin {

	public static void main(String[] args) {

		// 0이나 1이 50% 의 확률로 나오도록 하시오!
		int sum = 0;
		int A = (int)(Math.random()+0.5);
		System.out.println(A);
		
		for(int i=0; i<10000; i++) {
			int a = (int)(Math.random()+0.5);
			sum = sum+a;
		}
		System.out.println("1이 나올 확률:"+sum/100+"%");
		
		int sum2 = 0;
		int b;
		for(int i=0; i<10000; i++) {
			if(Math.random()>=0.5) b=1;
			else b=0;
			sum2 = sum2+b;
		}
		System.out.println("1이 나올 확률:"+sum2/100+"%");
		
		// 0과 1중 1이 70%의 확률로 나오도록 하려면??
		
		int sum3=0;
		int c;
		
		for(int i=0; i<10000; i++) {
			if(Math.random()>=0.3)c=1;
			else c=0;
			sum3 = sum3+c;
		}
		System.out.println("1이 나올 확률"+sum3/100+"%");
		
		// 주사위처럼 1~6의 정수가 나오게 하려면??
		
		int d;
		d = (int)(Math.random()*6)+1;
		System.out.println("주사위를 굴립니다 : "+d);
	}

}
