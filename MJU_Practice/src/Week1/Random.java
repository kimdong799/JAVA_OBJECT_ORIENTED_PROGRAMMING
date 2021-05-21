package Week1;

public class Random {

	public static void main(String[] args) {
		//Q.난수 하나를 생성하여 0.5 이상이면 "0.5 이상" 을 출력하는 조건문을 작성하시오.
		double r=Math.random();
		if(r>0.5) {
			System.out.println("0.5이상");
		}
		//Q.난수 하나를 생성하여 0.5보다 이상이면 "0.5 이상"을 출력하고 05 미만이면 "0.5 미만"을 출력하시오.
		double t=Math.random();
		if(r<=0.5) {
			System.out.println("0.5이상");
		}
		else {
			System.out.println("0.5미만");
		}
	}

}
