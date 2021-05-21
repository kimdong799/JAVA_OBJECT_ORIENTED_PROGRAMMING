package CodingTest;
import java.util.Scanner;
import java.util.Random;

public class LadderGame {
	
	static int chooseNum;//선택할 사다리 번호
	static int n=10;
	static int m=7;
	static int[][]ladder = new int[n][m];//10행 7열의 배열 생성
	
	static int number;
	
	// 사다리 생성 메소드
	public static void CreateLadder() {
		//0:사다리 사이의 공백 출력.
		//1:사다리 사이에 가로선 출력.
		//2:1,2,3,4번 줄 출력.
		//3:사다리 게임 실행 시 이동루트 표현.
		Random r = new Random();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(j%2==0)ladder[i][j]=2;  //열번호를 0~7까지 1씩 증가시키면서 짝수인 경우 해당 배열의 값에 2를 대입. 
				else ladder[i][j]=r.nextInt(2);// 나머지는 0,1의 난수를 대입
			}
		}
		
		System.out.println("★☆★☆★☆★☆★☆★☆\n사다리 게임.by Kim\n★☆★☆★☆★☆★☆★☆");
		
		for(int i=0; i<n; i++) {
			if(i>1 && i<8) {
				System.out.println("??????????"); // 행의 값이 2~7이면 ?를 출력
				continue; // ? 표시와 사다리가 겹치지 않게하기위해 continue 사용
			}
			for(int j=0; j<m; j++) {
				if(ladder[i][j]==0)System.out.print("  "); //0이면 공백 출력
				else if(ladder[i][j]==1)System.out.print("--"); // 1이면 가로선 출력
				else System.out.print("|"); // 나머지는 가로선 출력
			}
			System.out.println();
		}
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("사다리 번호를 입력하세요.\n1~4까지의 번호만 가능합니다. :-) \n");
			chooseNum = sc.nextInt();// ChooseNum 변수에 사용자의 입력값을 대임.
			if (chooseNum<5) break;
		}
		
	}
	
	public static void PlayLadder(int num, int[][]ladder) {
		number = num;
		int laddernum;
		
		// 행을 10번 반복.
		for(int i=0; i<n; i++) {
			while(true) {
				laddernum = 2*number-2; // 1 입력 시 0, 2입력 시 2, 3입력 시 4, 4입력 시 6
				ladder[i][laddernum]=3;
				
				//해당 줄이 1번이 아니면서 왼쪽에 1의 값이 있을 때 3을 대입하기.
				if((laddernum-1)>=0 && ladder[i][laddernum-1]==1) {
					ladder[i][laddernum-1]=3;
					ladder[i][laddernum-2]=3;
					laddernum-=2;
					num -=1;
				}
				// 해당 줄이 4번이 아니고 오른쪽에 1의 값이 있을 때 3 대입하기.
				else if((laddernum+1)<7 && ladder[i][laddernum+1]==1) {
					ladder[i][laddernum+1]=3;
					ladder[i][laddernum+2]=3;
					laddernum+=2;
					num+=1;
				}
				else break; // while문이 true이기에 갈곳이 없으면 break
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
		System.out.println(number+"번째 줄 당첨입니다!");
	}
	

	public static void main(String[] args) {
		LadderGame l = new LadderGame();
		l.CreateLadder();
		l.PlayLadder(chooseNum,ladder);
		l.printladder(ladder);

	}

}
