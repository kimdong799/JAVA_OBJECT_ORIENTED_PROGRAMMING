package CodingTest;
import java.util.Scanner;

public class FormatStudentNo {

	public static void main(String[] args) {
		
//			행입력 :5
//			
//			  1
//			  3  5
//			  7  9 11
//			 13 15 17 19
//			 21 23 25 27 29
			 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행입력 :");
		int row = 5;
		int a = 1;
		for(int i=1; i<=row; i++) {
			for(int j=5; j>=i; j--) {
				System.out.printf("%3d",a);
				a+=2;
			}
			System.out.println();
		}
		System.out.println();
		
//		1  2  3  4  5  
//		6  7  8  9  
//		10 11 12 
//		13 14 
//		15 
		
		int b=1;
		for(int i=row; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.printf("%-3d",b);
				b++;
			}
			System.out.println();
		}
		
//		  1
//		  -2  3
//		   4 -5  6
//		  -7  8 -9 10
//		  11-12 13-14 15
		
		int c=1;
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				if(i%2==0 && j%2==1) {
					System.out.printf("%3d",-c);
				}
				else if(i%2==1 && j%2==0) {
					System.out.printf("%3d",-c);
				}
				else {
					System.out.printf("%3d", c);
				}
				c++;
				}
			System.out.println();
			}
		
//		01 
//		02 03 
//		04 05 06 
//		07 08 09 10 
//		11 12 13 14 15 
		
		System.out.println();
		int d=1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("%02d ",d);
				d++;
			}
			System.out.println();
		}
		}
	}


