package FinalPractice;

abstract class Animal{ // 추상클래스
	String name; // 멤버변수
	
	Animal(String name){
		this.name = name;
	}
	Animal(){}
	
	abstract void move();// 추상메소드
	abstract void howl();// 추상메소드
}
class horse extends Animal{
	
	public horse(String name) {
		super.name=name;
	}
	public void move() {
		System.out.println("다그닥");
	}
	public void howl() {
		System.out.println("히히힝");
	}
}
class fox extends Animal{
	public fox(String name) {
		super.name=name;
	}
	public void move() {
		System.out.println("사뿐사뿐");
	}
	public void howl() {
		System.out.println("아우우");
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		horse h = new horse("날쌘돌이");
		h.move();
		h.howl();
		fox f = new fox("폭시");
		f.move();
		f.howl();
		System.out.println(f.name+"/"+h.name);

	}

}
