package MidExam;

public class Formatting {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<4; j++) {
				System.out.printf(" ");
			}
			int a = 15;
			for(int j=0; j<=i; j++) {
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
