package Week5;
import java.util.Scanner;
import java.util.Random;

public class Ladder {

	static int chooseNum;
	
	static int [][]ladder = new int [10][7];
	
	//��ٸ� �����
	//0: ��ٸ� �� ���̿� ���� �׾����� ����
	//1: ��ٸ� �� ���̿� ���� �׾���
	//2: 1,2,3,4 �� �� ǥ��
	//3: ���õ� �ٷ� ��ٸ��� Ż �� ��Ʈ ǥ��
	public static void createLadder() {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			for(int j=0;j<7;j++){
				//�迭 �ε����� 0,2,4,6�� �� ��ٸ� �� ǥ���ϱ�
				//�� �ܿ��� 0,1�� ������ ���� �߻���Ű��
				if(j%2==0) {
					ladder[i][j]=2;
				}else {
					ladder[i][j]=r.nextInt(2);
				}
			}

		}
	
		System.out.println();	
		System.out.println("   ��ٸ� ����  ");
		System.out.println();
		
		for(int i=0; i<10; i++) {
			// 3~7��° �迭�� ����ǥ�� ������
			if(i>=3 && i<=8) {
				System.out.println("??????????");
				continue;
			}
			for(int j=0; j<7; j++) {
				//0�� �� ����, 1�� �� ��ٸ� ���� ��, 2�� �� ��ٸ� �� ���
				if(ladder[i][j]==0)System.out.print("  ");
				else if(ladder[i][j]==1)System.out.print("--");
				else System.out.print("|");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("1~4�� �� �ϳ��� �������ּ���:-)");
		
		Scanner sc = new Scanner(System.in);
		
		chooseNum = sc.nextInt();
		
	}

	public static void playLadder(int num, int[][]ladder) {
		int number = num;
		
		int ladderNum;
		
		for(int i=0; i<10; i++) {
			while(true) {
				ladderNum = 2*number-2;
				ladder[i][ladderNum]=3;
				if((ladderNum-1)>=0 && ladder[i][ladderNum-1]==1) {
					ladder[i][ladderNum-1]=3;
					ladder[i][ladderNum-2]=3;
					ladderNum -=2;
					number-=1;
				}
				else if((ladderNum+1)<7 && ladder[i][ladderNum+1]==1) {
					ladder[i][ladderNum+1]=3;
					ladder[i][ladderNum+2]=3;
					ladderNum +=2;
					number++;
				}else break;
			}
			
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<7; j++) {
				if(ladder[i][j]==0)System.out.print("  ");
				else if(ladder[i][j]==1)System.out.print("--");
				else if(ladder[i][j]==2)System.out.print("|");
				else if(ladder[i][j]==3 && j %2==0)System.out.print("*");
				else if(ladder[i][j]==3 && j %2!=0)System.out.print("**");
			}
			System.out.println();
		}
		System.out.println("��÷ ��ȣ�� "+number+"�� �Դϴ�!!!");
	}
	public static void main(String[] args) {
		createLadder();
		playLadder(chooseNum, ladder);
		
	}

}
