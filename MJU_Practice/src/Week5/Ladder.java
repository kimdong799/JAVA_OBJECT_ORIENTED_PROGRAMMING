package Week5;
import java.util.Scanner;
import java.util.Random;

public class Ladder {

	static int chooseNum;
	
	static int [][]ladder = new int [10][7];
	
	//사다리 만들기
	//0: 사다리 줄 사이에 선이 그어지지 않음
	//1: 사다리 줄 사이에 선이 그어짐
	//2: 1,2,3,4 번 줄 표현
	//3: 선택된 줄로 사다리를 탈 때 루트 표현
	public static void createLadder() {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			for(int j=0;j<7;j++){
				//배열 인덱스가 0,2,4,6일 때 사다리 줄 표현하기
				//그 외에는 0,1로 나누어 난수 발생시키기
				if(j%2==0) {
					ladder[i][j]=2;
				}else {
					ladder[i][j]=r.nextInt(2);
				}
			}

		}
	
		System.out.println();	
		System.out.println("   사다리 게임  ");
		System.out.println();
		
		for(int i=0; i<10; i++) {
			// 3~7번째 배열을 물음표로 가리기
			if(i>=3 && i<=8) {
				System.out.println("??????????");
				continue;
			}
			for(int j=0; j<7; j++) {
				//0이 빈 공간, 1일 때 사다리 사이 선, 2일 때 사다리 줄 출력
				if(ladder[i][j]==0)System.out.print("  ");
				else if(ladder[i][j]==1)System.out.print("--");
				else System.out.print("|");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("1~4번 중 하나를 선택해주세요:-)");
		
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
		System.out.println("당첨 번호는 "+number+"번 입니다!!!");
	}
	public static void main(String[] args) {
		createLadder();
		playLadder(chooseNum, ladder);
		
	}

}
