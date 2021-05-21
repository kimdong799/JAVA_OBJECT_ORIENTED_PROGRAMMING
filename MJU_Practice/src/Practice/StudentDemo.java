package Practice;
import java.util.Scanner;

public class StudentDemo {

	int score_kor;
	int score_eng;
	
	public void sum() {
		System.out.println(this.score_kor+this.score_eng);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDemo s = new StudentDemo();
		StudentDemo s2 = new StudentDemo();
	
		s.score_kor=70;
		s.score_eng=80;
		s.sum();
		
		s2.score_kor=sc.nextInt();
		s2.score_eng=sc.nextInt();
		s2.sum();

	}

}
