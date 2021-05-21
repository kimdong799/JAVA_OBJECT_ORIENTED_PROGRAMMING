package CodingTest;
import java.util.Random;
import java.util.Scanner;
// 중복되지 않는 난수 출력
public class Lotto {
	
	int num;
	int[]InputArr = new int[5];
	int[]arr = new int [5];
	
	public void inputlotto() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<InputArr.length; i++) {
			System.out.println("로또 숫자를 입력하세요.");
			InputArr[i] = sc.nextInt();
		}
		System.out.println("입력한 로또입니다.");
		for(int i=0; i<InputArr.length; i++) {
			System.out.print(InputArr[i]+" ");
		}
		System.out.println();
		
	}
	
	public void printlotto() {
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=r.nextInt(10)+1;
			for(int j=0; j<i; j++) {
				if (arr[i]==arr[j]) {
					i--;
				}
			}
		}
		System.out.println("로또 결과입니다.");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public void countlotto() {
		int count=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(InputArr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println("로또당첨 결과:"+count);
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		
		l.inputlotto();
		l.printlotto();
		l.countlotto();
	}

}
