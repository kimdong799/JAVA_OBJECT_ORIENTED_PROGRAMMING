package Week2;
import java.util.Scanner;

// 국어점수와 영어점수를 입력받아 총합을 구하는 프로그램을 구현해보자!

public class Student {//클래스 명

	//멤버변수
	int score_kor;
	int score_eng;
	
	//메소드
	public void sum(int score_kor, int score_eng) {
		this.score_kor = score_kor;
		this.score_eng = score_eng;
		//System.out.println("총합 : "+(int)(score_kor+score_eng));
		int result=score_eng+score_kor;
		System.out.println("총합:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		Student s = new Student();
		s.sum(kor, eng);
	}

}
