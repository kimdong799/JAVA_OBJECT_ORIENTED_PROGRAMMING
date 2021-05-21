package Practice;

public class week1 {

	public void printrandom() {
		double r= Math.random();
		if(r>=0.5)System.out.println("0.5이상입니다./"+r);
		else System.out.println("0.5미만입니다./"+r);
	}
	public void printhelloWhile() {
		int i=0;
		while(true) {
			System.out.print(i+")Hello_JAVA ");
			i++;
			if(i>=5)break;
		}
	}
	
	public void printhelloFor() {
		for(int i=0; i<5; i++) {
			System.out.print(i+")Hello_JAVA ");
		}
	}
	
	public void printSum() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합계: "+sum);
	}
	
	public void continue_break() {
		for(int i=1; i<11; i++) {
			if(i%2==1) continue;
			if(i==8)break;
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		week1 w = new week1();
		
		w.printrandom();
		w.printhelloWhile();
		System.out.println();
		w.printhelloFor();
		System.out.println();
		w.printSum();
		w.continue_break();
	}

}
