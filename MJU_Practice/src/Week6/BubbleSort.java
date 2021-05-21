package Week6;
import java.util.Scanner;

public class BubbleSort {

	static int [] arr = new int [10];
	static int min,max;
	
	public static void inputValues() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
				System.out.println("�迭�� �� ���� �Է��ϼ���.\n0�� �Է��ϸ� ����˴ϴ�.");
				arr[i] = sc.nextInt();
				if (arr[i]==0)break;
			}
		}
	
	public static void printarr() {
		System.out.println("�Է��� �迭�Դϴ�.");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0)System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void max_min() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0)System.out.println(arr[i]);
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min && arr[i]!=0) {
				min=arr[i];
			}
		}
		System.out.println("�ִ�: "+max+" �ּ�: "+min);
	}
	
	public static void bublesort(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0)System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		inputValues();
		printarr();
		max_min();
		bublesort(arr);
	}

}
