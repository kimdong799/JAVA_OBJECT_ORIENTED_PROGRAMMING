package WEEK6;
 // 배열의 범위를 벗어난 경우!
public class Exception_ArrayIndex {

	public static void main(String[] args) {
		int c[] = new int[5];
		
		try {
		for(int i=0; i<10; ++i) {
			System.out.println(i);
			c[i] = i;
		}
		}catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("배열의 범위를 범어났습니다.");
		}
		System.out.println("프로그램 종료");
	}

}
