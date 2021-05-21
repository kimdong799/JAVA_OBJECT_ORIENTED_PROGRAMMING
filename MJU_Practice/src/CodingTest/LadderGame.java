package CodingTest;
import java.util.Scanner;
import java.util.Random;

public class LadderGame {
	
	static int chooseNum;//������ ��ٸ� ��ȣ
	static int n=10;
	static int m=7;
	static int[][]ladder = new int[n][m];//10�� 7���� �迭 ����
	
	static int number;
	
	// ��ٸ� ���� �޼ҵ�
	public static void CreateLadder() {
		//0:��ٸ� ������ ���� ���.
		//1:��ٸ� ���̿� ���μ� ���.
		//2:1,2,3,4�� �� ���.
		//3:��ٸ� ���� ���� �� �̵���Ʈ ǥ��.
		Random r = new Random();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(j%2==0)ladder[i][j]=2;  //����ȣ�� 0~7���� 1�� ������Ű�鼭 ¦���� ��� �ش� �迭�� ���� 2�� ����. 
				else ladder[i][j]=r.nextInt(2);// �������� 0,1�� ������ ����
			}
		}
		
		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�\n��ٸ� ����.by Kim\n�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
		
		for(int i=0; i<n; i++) {
			if(i>1 && i<8) {
				System.out.println("??????????"); // ���� ���� 2~7�̸� ?�� ���
				continue; // ? ǥ�ÿ� ��ٸ��� ��ġ�� �ʰ��ϱ����� continue ���
			}
			for(int j=0; j<m; j++) {
				if(ladder[i][j]==0)System.out.print("  "); //0�̸� ���� ���
				else if(ladder[i][j]==1)System.out.print("--"); // 1�̸� ���μ� ���
				else System.out.print("|"); // �������� ���μ� ���
			}
			System.out.println();
		}
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("��ٸ� ��ȣ�� �Է��ϼ���.\n1~4������ ��ȣ�� �����մϴ�. :-) \n");
			chooseNum = sc.nextInt();// ChooseNum ������ ������� �Է°��� ����.
			if (chooseNum<5) break;
		}
		
	}
	
	public static void PlayLadder(int num, int[][]ladder) {
		number = num;
		int laddernum;
		
		// ���� 10�� �ݺ�.
		for(int i=0; i<n; i++) {
			while(true) {
				laddernum = 2*number-2; // 1 �Է� �� 0, 2�Է� �� 2, 3�Է� �� 4, 4�Է� �� 6
				ladder[i][laddernum]=3;
				
				//�ش� ���� 1���� �ƴϸ鼭 ���ʿ� 1�� ���� ���� �� 3�� �����ϱ�.
				if((laddernum-1)>=0 && ladder[i][laddernum-1]==1) {
					ladder[i][laddernum-1]=3;
					ladder[i][laddernum-2]=3;
					laddernum-=2;
					num -=1;
				}
				// �ش� ���� 4���� �ƴϰ� �����ʿ� 1�� ���� ���� �� 3 �����ϱ�.
				else if((laddernum+1)<7 && ladder[i][laddernum+1]==1) {
					ladder[i][laddernum+1]=3;
					ladder[i][laddernum+2]=3;
					laddernum+=2;
					num+=1;
				}
				else break; // while���� true�̱⿡ ������ ������ break
			}
		}
	}
	public static void printladder(int[][]ladder) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(ladder[i][j]==0)System.out.print("  ");
				else if(ladder[i][j]==1)System.out.print("--");
				else if(ladder[i][j]==2)System.out.print("|");
				else if(ladder[i][j]==3 && j%2==0)System.out.print("*");
				else if(ladder[i][j]==3 && j%2!=0)System.out.print("**");
			}
			System.out.println();
		}
		System.out.println(number+"��° �� ��÷�Դϴ�!");
	}
	

	public static void main(String[] args) {
		LadderGame l = new LadderGame();
		l.CreateLadder();
		l.PlayLadder(chooseNum,ladder);
		l.printladder(ladder);

	}

}
