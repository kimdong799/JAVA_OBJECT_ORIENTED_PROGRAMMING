package Week6;

public class ArrayException {

	public static void main(String[] args) {
		int[]x = {2, 5, 6, 12, 1 };
		int i=0;
		try {
			while(i<=x.length) {
				if(x[i] % 2==0)System.out.println(x[i]);
				i++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류");
			}
		System.out.println("프로그램 종료");
			
		}

	}


