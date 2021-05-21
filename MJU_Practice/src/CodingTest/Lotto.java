package CodingTest;
import java.util.Random;
import java.util.Scanner;
// �ߺ����� �ʴ� ���� ���
public class Lotto {
	
	int num;
	int[]InputArr = new int[5];
	int[]arr = new int [5];
	
	public void inputlotto() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<InputArr.length; i++) {
			System.out.println("�ζ� ���ڸ� �Է��ϼ���.");
			InputArr[i] = sc.nextInt();
		}
		System.out.println("�Է��� �ζ��Դϴ�.");
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
		System.out.println("�ζ� ����Դϴ�.");
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
		System.out.println("�ζǴ�÷ ���:"+count);
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		
		l.inputlotto();
		l.printlotto();
		l.countlotto();
	}

}
