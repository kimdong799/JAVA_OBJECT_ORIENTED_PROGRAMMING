package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortDemo {

	public static int a,b,max,min;
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		for(int i=0; i<10; i++) {
			a=sc.nextInt();
			if(a!=0)list.add(a);
			else break;
		}
		
		int[]array = new int[list.size()];
		for(int i=0; i<array.length; i++) {
			array[i]=list.get(i);
		}
		max=array[0];
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		min=array[0];
		for(int i=0; i<array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println(min+" "+max);
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					b=array[i];
					array[i]=array[j];
					array[j]=b;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]<array[j]) {
					b=array[i];
					array[i]=array[j];
					array[j]=b;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	

}
