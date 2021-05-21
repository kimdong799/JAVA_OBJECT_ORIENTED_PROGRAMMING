package MidExam;
import java.util.Scanner;

public class Student {
	private int StudentNo; // �й�
	private String Name; // �̸�
	private boolean registered; // ��Ͽ���
	
	private Student(int StudentNo, String Name, boolean registered) {
		this.StudentNo = StudentNo;
		this.Name = Name;
		this.registered = registered;
	}
	private void showinfo() {
		System.out.println("�й� "+this.StudentNo+" �̸� "+this.Name+" ��Ͽ��� "+this.registered);
	}
	
	private void register() {
		if(this.registered==true) {
			System.out.println("�̹� ��ϵǾ� �ֽ��ϴ�.");
		}
		else {
			System.out.println("��ϵǾ����ϴ�.");
			this.registered=true;
		}
	}
	private void leave() {
		if(this.registered==true) {
			System.out.println("����ó���Ǿ����ϴ�.");
			this.registered=false;
		}
		else System.out.println("�̹� ���� ���Դϴ�.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student(sc.nextInt(), sc.next(), true);
		s.register();
		s.leave();
		s.showinfo();
	}

}
