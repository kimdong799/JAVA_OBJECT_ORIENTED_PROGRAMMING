package Week5;

public class Coin {

	public static void main(String[] args) {
		
		// Q1.50퍼센트 확률로 0이나 1이 나오도록 하세요
		
		int sum = 0;
		for(int i=0; i<10000; i++) {
			double r = Math.random()+0.5; // 0.5부터 1.5까지의 난수 발생.
			sum += r;  // 정수형 변수인 sum에 r을 대입.
		}
		System.out.println(sum);
		System.out.println("1이 나올 확률 :"+sum/100+"%");
		
		// Q2. 70퍼센트 확률로 1이 나오도록 하려면?
		int a;
		int sum2 = 0;
		for(int i=0; i<10000; i++) {
			double r2 = Math.random();
			if(r2<=0.7) a=1;
			else a=0;
			sum2+=a;
		}
		System.out.println("1이 나올 확률 : "+sum2/100+"%");
		
		// Q3. 주사위처럼 6개의 숫자가 나오도록 하려면??
		
		int b;
		int dice;
		double r3;
		r3 = Math.random()*6+1; // 0.1 ~ 6.99 까지 반환.
		dice = (int)r3;
		System.out.println("주사위를 굴립니다."+dice);
		
	}

}
