package week5;

interface Playable {
	void ready();
	void play();
}


class Violin implements Playable{
	
	public void ready() {
		System.out.println("���̿ø��� �غ�Ǿ����ϴ�.");
	}
	public void play() {
		System.out.println("��~��~��~");
	}
}

class Guitar implements Playable{
	public void ready() {
		System.out.println("��Ÿ�� �غ�Ǿ����ϴ�.");
	}
	public void play() {
		System.out.print("��~��~");
	}
}
