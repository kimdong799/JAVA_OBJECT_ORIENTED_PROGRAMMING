package Practice;

class Parent{
	String mother, father; //멤버 변수
	
	public Parent() {} // 기본 생성자.
	
	public Parent(String m, String f) { // 인자값을 받아 멤버변수 값을 초기화하는 생성자.
		this.mother = m;
		this.father = f;
	}
	public String parentname() { // 부모의 이름을 반환하는 메소드
		String r= this.mother+"/"+this.father;
		return r;
	}
}
class Child extends Parent{ // parent 클래스를 상속받는 child 클래스
	String son, daughter; // 멤버변수
	
	public Child(String s, String d) {
		super("child.mother","child.father"); // 상위클래스 멤버 초기화
		this.son = s;
		this.daughter = d;
	}
	public void famillyname() {
		System.out.println(super.father+"/"+super.mother+"/"+this.son+"/"+this.daughter);
	}
	
	
}
public class FamillyDemo {

	public static void main(String[] args) {
		Child c = new Child("김","홍");
		c.famillyname();
	}

}
