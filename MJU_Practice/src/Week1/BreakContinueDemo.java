package Week1;

public class BreakContinueDemo {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==4)break; // 반복문 중단.
			System.out.print(i);
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i==4) continue; // 실행중지 후 반복 재개
			System.out.print(i);	
		}
		System.out.println();
		
		//Q.1부터 10까지의 수를 인쇄하다가 3의 배수가 되면 건너뛰시오.
		for(int i=0; i<10; i++) {
			if(i%3==0)continue;
			System.out.print(i);
		}

	}

}
