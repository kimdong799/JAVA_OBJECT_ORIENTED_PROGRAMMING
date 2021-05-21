package WEEK6;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {
	
	public static int a,b,max,min;
	
	public static void bubleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		
		Scanner scn=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i=0;i<10;i++) {
			a=scn.nextInt();
			if(a!=0)list.add(a);
			else break;
		}
		int[] array=new int[list.size()];
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
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("최대:"+max+" 최소:"+min);
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					b=array[i];
					array[i]=array[j];
					array[j]=b;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		
		//int[]arr=new int[] {3,6,41,2,4,1,5,743};
		System.out.println("");
		bubleSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}

	}

}
