package FinalPractice;

interface Playable{
	void ready();
	void play();
}
class guitar implements Playable{
	public void ready() {
		System.out.println("��Ÿ�� �غ�Ǿ����ϴ�.");
	}
	public void play() {
		System.out.println("�𸵵�");
	}
}
class violin implements Playable{
	public void ready() {
		System.out.println("���̿ø� �غ�Ǿ����ϴ�.");
	}
	public void play() {
		System.out.println("������");
	}
}
public class instrumentDemo {

	public static void main(String[] args) {
		guitar g = new guitar();
		violin v = new violin();
		
		g.ready();
		g.play();
		v.ready();
		v.play();
	}

}
