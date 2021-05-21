package Week5;

interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface beilever{}

class Steve implements father, programmer, beilever{
	public void coding() {
		System.out.println("fast");//코딩이라는 메소드의 구현을 강제
	}
}
class Rachel implements mother, programmer{
	public void coding() {
		System.out.println("elegance");// 코딩이라는 메소드의 구현을 강제
	}
}

public class Workspace {

	public static void main(String[] args) {
		programmer employee1 = new Steve();//데이터 타입은 프로그래머, 프로그래머의 메소드만 사용가능
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();

	}

}
