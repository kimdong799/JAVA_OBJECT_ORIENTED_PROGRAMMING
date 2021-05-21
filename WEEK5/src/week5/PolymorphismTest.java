package week5;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		Human h = new Kim();
		h.call();
		//h.status(); -> human에 존재하지 않는 메소드는 사용불가.

	}

}
