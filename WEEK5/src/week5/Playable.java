package week5;

interface Playable {
	void ready();
	void play();
}


class Violin implements Playable{
	
	public void ready() {
		System.out.println("바이올린이 준비되었습니다.");
	}
	public void play() {
		System.out.println("낑~낑~낑~");
	}
}

class Guitar implements Playable{
	public void ready() {
		System.out.println("기타가 준비되었습니다.");
	}
	public void play() {
		System.out.print("디링~디링~");
	}
}
