package Week2;
import java.util.Scanner;

// ���������� ���������� �Է¹޾� ������ ���ϴ� ���α׷��� �����غ���!

public class Student {//Ŭ���� ��

	//�������
	int score_kor;
	int score_eng;
	
	//�޼ҵ�
	public void sum(int score_kor, int score_eng) {
		this.score_kor = score_kor;
		this.score_eng = score_eng;
		//System.out.println("���� : "+(int)(score_kor+score_eng));
		int result=score_eng+score_kor;
		System.out.println("����:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int eng = sc.nextInt();
		Student s = new Student();
		s.sum(kor, eng);
	}

}
