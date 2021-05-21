package week5;
import java.util.Scanner;

interface Atackable{
	void attack(String s);

	void skill(int a);
}

interface Defensible{
	void defense(int a);
}


public class Pocketmon implements Atackable, Defensible{

int HP_Charmander = 100;
int HP_Ggobugi = 100;

public void attack(String s) {
	System.out.println("���αⰡ "+s+"�� �����մϴ�.");
}
public void skill(int a) {
	if (a==1) {
		System.out.println("���αⰡ �����ġ�⸦ ����մϴ�.");
		HP_Charmander = (HP_Charmander-30);
		System.out.println("���� ���̸��� HP�� "+HP_Charmander+"�� �Ǿ����ϴ�.");
	}
	else {
		System.out.println("���αⰡ �������� ����մϴ�.");
	
	HP_Charmander = (HP_Charmander-50);
	System.out.println("���� ���̸��� HP�� "+HP_Charmander+"�� �Ǿ����ϴ�.");
	}
	if(HP_Charmander<=0) {
		System.out.println("���� ���̸��� �����߽��ϴ�.");
		System.out.println("���α� �¸�!!");
	
	}
}

public void defense(int a){
	if(a==1) {
		System.out.println("���� ���̸��� �Ҳɼ����� ����մϴ�.");
		System.out.println("���αⰡ ��ũ���⸦ ����� ���������� ����մϴ�.");
	HP_Ggobugi = HP_Ggobugi - 20;
	System.out.println("���α��� HP�� "+HP_Ggobugi+"�� �Ǿ����ϴ�.");
	}
	else {
		System.out.println("���� ���̸��� ������ȭ�� ����մϴ�.");
		System.out.println("���αⰡ �ܴ������⸦ ����� ���������� ����մϴ�.");
		HP_Ggobugi = HP_Ggobugi - 15;
		System.out.println("���α��� HP�� "+HP_Ggobugi+"�� �Ǿ����ϴ�.");
	}
	if(HP_Ggobugi<=0) {
		System.out.println("���αⰡ �����߽��ϴ�.");
		System.out.println("���� ���̸� �¸�!!");
	}
}


public static void main(String[] args) {
	
	Pocketmon p = new Pocketmon();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� ���л�???�� �ºθ� �ɾ�Դ�!");
	System.out.println("�١ڡ١ڡ١����ϸ� ��Ʋ�� �����մϴ١١ڡ١ڡ١�");
	System.out.println("------------------------");
	p.attack("���̸�");
	System.out.println("��ų��ȣ�� �Է��ϼ���.\n1�� :�����ġ��\n2�� :������");
	int z = sc.nextInt();
	p.skill(z);
	p.defense(2);
	System.out.println("��ų��ȣ�� �Է��ϼ���.\n1�� :�����ġ��\n2�� :������");
	z = sc.nextInt();
	p.skill(z);
	
}

}

