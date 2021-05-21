package MidExam;
import java.util.Scanner;

public class Student {
	private int StudentNo; // 학번
	private String Name; // 이름
	private boolean registered; // 등록여부
	
	private Student(int StudentNo, String Name, boolean registered) {
		this.StudentNo = StudentNo;
		this.Name = Name;
		this.registered = registered;
	}
	private void showinfo() {
		System.out.println("학번 "+this.StudentNo+" 이름 "+this.Name+" 등록여부 "+this.registered);
	}
	
	private void register() {
		if(this.registered==true) {
			System.out.println("이미 등록되어 있습니다.");
		}
		else {
			System.out.println("등록되었습니다.");
			this.registered=true;
		}
	}
	private void leave() {
		if(this.registered==true) {
			System.out.println("휴학처리되었습니다.");
			this.registered=false;
		}
		else System.out.println("이미 휴학 중입니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student(sc.nextInt(), sc.next(), true);
		s.register();
		s.leave();
		s.showinfo();
	}

}
