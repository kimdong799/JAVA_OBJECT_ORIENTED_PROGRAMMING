package CodingTest;

public class ForPractice {

	public static void main(String[] args) {
		//구구단 예제
		System.out.println("구구단\n");
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n5행 5열 별찍기\n");
		//5행 5열 별표찍기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 삼각형 별찍기
		System.out.println("\n삼각형 별찍기\n");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 역삼각형 별찍기
		System.out.println("\n역삼각형 별찍기\n");
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		 11111
//	     22222
//	     33333
//	     44444
//	     55555
		//다양한 숫자탑 출력
		System.out.println("\n다양한 숫자탑 출력\n");
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
//		012345
//		012345
//		012345
//		012345
//		012345
//		012345
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		012345
//		123456
//		234567
//		345678
//		456789
//		5678910
		
		System.out.println();
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		
		System.out.println();
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.printf("*");
			}
			System.out.println();
			for(int j=0; j<=i; j++) {
				System.out.printf(" ");
			}
		}

		System.out.println();
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
	 
		for(int i=0; i<5; i++) {
			for(int j=i; j<4; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int j=i; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		System.out.println();
		
		for(int i=1; i<10; i+=2) {
			for(int j=i/2; j<=3; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		

	
	}

}
