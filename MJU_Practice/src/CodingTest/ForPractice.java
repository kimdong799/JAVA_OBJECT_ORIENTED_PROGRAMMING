package CodingTest;

public class ForPractice {

	public static void main(String[] args) {
		//������ ����
		System.out.println("������\n");
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n5�� 5�� �����\n");
		//5�� 5�� ��ǥ���
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �ﰢ�� �����
		System.out.println("\n�ﰢ�� �����\n");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ���ﰢ�� �����
		System.out.println("\n���ﰢ�� �����\n");
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
		//�پ��� ����ž ���
		System.out.println("\n�پ��� ����ž ���\n");
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
