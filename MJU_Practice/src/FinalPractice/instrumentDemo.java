package FinalPractice;

interface Playable{
	void ready();
	void play();
}
class guitar implements Playable{
	public void ready() {
		System.out.println("기타가 준비되었습니다.");
	}
	public void play() {
		System.out.println("디링디링");
	}
}
class violin implements Playable{
	public void ready() {
		System.out.println("바이올린 준비되었습니다.");
	}
	public void play() {
		System.out.println("낑낑낑");
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
