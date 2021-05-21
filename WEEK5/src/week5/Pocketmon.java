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
	System.out.println("꼬부기가 "+s+"를 공격합니다.");
}
public void skill(int a) {
	if (a==1) {
		System.out.println("꼬부기가 몸통박치기를 사용합니다.");
		HP_Charmander = (HP_Charmander-30);
		System.out.println("상대방 파이리의 HP가 "+HP_Charmander+"가 되었습니다.");
	}
	else {
		System.out.println("꼬부기가 물대포를 사용합니다.");
	
	HP_Charmander = (HP_Charmander-50);
	System.out.println("상대방 파이리의 HP가 "+HP_Charmander+"가 되었습니다.");
	}
	if(HP_Charmander<=0) {
		System.out.println("상대방 파이리가 기절했습니다.");
		System.out.println("꼬부기 승리!!");
	
	}
}

public void defense(int a){
	if(a==1) {
		System.out.println("상대방 파이리가 불꽃세레를 사용합니다.");
		System.out.println("꼬부기가 웅크리기를 사용해 성공적으로 방어합니다.");
	HP_Ggobugi = HP_Ggobugi - 20;
	System.out.println("꼬부기의 HP가 "+HP_Ggobugi+"가 되었습니다.");
	}
	else {
		System.out.println("상대방 파이리가 전광석화를 사용합니다.");
		System.out.println("꼬부기가 단단해지기를 사용해 성공적으로 방어합니다.");
		HP_Ggobugi = HP_Ggobugi - 15;
		System.out.println("꼬부기의 HP가 "+HP_Ggobugi+"가 되었습니다.");
	}
	if(HP_Ggobugi<=0) {
		System.out.println("꼬부기가 기절했습니다.");
		System.out.println("상대방 파이리 승리!!");
	}
}


public static void main(String[] args) {
	
	Pocketmon p = new Pocketmon();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("낯선 복학생???이 승부를 걸어왔다!");
	System.out.println("☆★☆★☆★포켓몬 배틀을 시작합니다☆★☆★☆★");
	System.out.println("------------------------");
	p.attack("파이리");
	System.out.println("스킬번호를 입력하세요.\n1번 :몸통박치기\n2번 :물대포");
	int z = sc.nextInt();
	p.skill(z);
	p.defense(2);
	System.out.println("스킬번호를 입력하세요.\n1번 :몸통박치기\n2번 :물대포");
	z = sc.nextInt();
	p.skill(z);
	
}

}

