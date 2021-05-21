package FinalPractice;

abstract class Animal{ // �߻�Ŭ����
	String name; // �������
	
	Animal(String name){
		this.name = name;
	}
	Animal(){}
	
	abstract void move();// �߻�޼ҵ�
	abstract void howl();// �߻�޼ҵ�
}
class horse extends Animal{
	
	public horse(String name) {
		super.name=name;
	}
	public void move() {
		System.out.println("�ٱ״�");
	}
	public void howl() {
		System.out.println("������");
	}
}
class fox extends Animal{
	public fox(String name) {
		super.name=name;
	}
	public void move() {
		System.out.println("��ӻ��");
	}
	public void howl() {
		System.out.println("�ƿ��");
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		horse h = new horse("���ڵ���");
		h.move();
		h.howl();
		fox f = new fox("����");
		f.move();
		f.howl();
		System.out.println(f.name+"/"+h.name);

	}

}
